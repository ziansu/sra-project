@java.lang.Override
public ai.grakn.graql.analytics.MaxQuery visitMax(ai.grakn.graql.internal.antlr.GraqlParser.MaxContext ctx) {
    ai.grakn.graql.analytics.MaxQuery max = queryBuilder.compute().max().of(visitOfList(ctx.ofList()));
    if ((ctx.inList()) != null) {
        max = max.in(visitInList(ctx.inList()));
    }
    return max;
}