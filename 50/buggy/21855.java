@java.lang.Override
public ai.grakn.graql.ValuePredicate visitPredicateVariable(ai.grakn.graql.internal.antlr.GraqlParser.PredicateVariableContext ctx) {
    return ai.grakn.graql.Graql.eq(getVariable(ctx.VARIABLE()));
}