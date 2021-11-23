@java.lang.Override
public ai.grakn.graql.MatchQuery visitMatchBase(ai.grakn.graql.internal.antlr.GraqlParser.MatchBaseContext ctx) {
    java.util.Collection<ai.grakn.graql.Pattern> patterns = visitPatterns(ctx.patterns());
    ai.grakn.graql.MatchQuery match = queryBuilder.match(patterns);
    if (!(ctx.VARIABLE().isEmpty())) {
        return match.select(ctx.VARIABLE().stream().map(this::getVariable).collect(java.util.stream.Collectors.toSet()));
    }else {
        return match;
    }
}