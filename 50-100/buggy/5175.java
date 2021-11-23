@java.lang.Override
public void outARuleAnySubMessageSubstitution(de.be4.classicalb.core.parser.rules.ARuleAnySubMessageSubstitution node) {
    addForceDefinition();
    final de.be4.classicalb.core.parser.rules.PSubstitution newNode = de.be4.classicalb.core.parser.rules.RulesTransformation.createPositinedNode(createCounterExampleSubstitutions(node.getIdentifiers(), node.getWhere(), null, node.getMessage(), node.getErrorType()), node);
    node.replaceBy(newNode);
}