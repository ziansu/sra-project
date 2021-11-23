private void replaceFailedRuleAllErrorTypesOperator(de.be4.classicalb.core.parser.rules.AOperatorPredicate node, final de.be4.classicalb.core.parser.rules.RuleOperation rule) {
    java.lang.String name = (rule.getName()) + (de.be4.classicalb.core.parser.rules.RulesTransformation.RULE_COUNTER_EXAMPLE_VARIABLE_SUFFIX);
    de.be4.classicalb.core.parser.rules.AEqualPredicate equal = new de.be4.classicalb.core.parser.rules.AEqualPredicate(new de.be4.classicalb.core.parser.rules.ADomainExpression(de.be4.classicalb.core.parser.rules.RulesTransformation.createIdentifier(name)), new de.be4.classicalb.core.parser.rules.AIntervalExpression(createAIntegerExpression(1), createAIntegerExpression(rule.getNumberOfErrorTypes())));
    node.replaceBy(equal);
    return ;
}