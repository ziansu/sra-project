@java.lang.Override
public ai.grakn.graql.analytics.MinQuery visitMin(ai.grakn.graql.internal.antlr.GraqlParser.MinContext ctx) {
    ai.grakn.graql.analytics.MinQuery min = queryBuilder.compute().min();
    if ((ctx.ofList()) != null) {
        min = min.of(visitOfList(ctx.ofList()));
    }
    if ((ctx.inList()) != null) {
        min = min.in(visitInList(ctx.inList()));
    }
    return min;
}