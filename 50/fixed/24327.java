@java.lang.Override
public checker.Type visitSpidExpression(checker.SpidExpression node) throws parser.ParseException {
    return node.getType();
}