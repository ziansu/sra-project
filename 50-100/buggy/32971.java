@java.lang.Override
public void outAForallSubMessageSubstitution(de.be4.classicalb.core.parser.rules.AForallSubMessageSubstitution node) {
    addForceDefinition();
    de.be4.classicalb.core.parser.rules.PSubstitution newNode = de.be4.classicalb.core.parser.rules.RulesTransformation.createPositinedNode(createCounterExampleSubstitutions(node.getIdentifiers(), node.getWhere(), node.getExpect(), node.getMessage(), node.getErrorType()), node);
    node.replaceBy(newNode);
}