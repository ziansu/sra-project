@java.lang.Override
public ai.grakn.graql.analytics.MinQuery visitMin(ai.grakn.graql.internal.antlr.GraqlParser.MinContext ctx) {
    ai.grakn.graql.analytics.MinQuery min = queryBuilder.compute().min().of(visitOfList(ctx.ofList()));
    if ((ctx.inList()) != null) {
        min = min.in(visitInList(ctx.inList()));
    }
    return min;
}