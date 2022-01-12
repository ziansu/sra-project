@java.lang.Override
public ai.grakn.graql.analytics.SumQuery visitSum(ai.grakn.graql.internal.antlr.GraqlParser.SumContext ctx) {
    ai.grakn.graql.analytics.SumQuery sum = queryBuilder.compute().sum().of(visitOfList(ctx.ofList()));
    if ((ctx.inList()) != null) {
        sum = sum.in(visitInList(ctx.inList()));
    }
    return sum;
}