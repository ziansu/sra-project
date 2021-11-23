private de.be4.classicalb.core.parser.rules.ADefinitionExpression applyExternalFunction(java.lang.String name, de.be4.classicalb.core.parser.rules.PExpression... expressions) {
    return new de.be4.classicalb.core.parser.rules.ADefinitionExpression(new de.be4.classicalb.core.parser.rules.TIdentifierLiteral(name), createExpressionList(expressions));
}