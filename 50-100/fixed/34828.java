boolean parseLeftAssocBinaryExpression(java.lang.String ExpressionType, java.lang.String ExpressionPartType, boolean part, net.masterthought.dlanguage.parser.Token... operators) {
    boolean node;
    if (!part) {
        node = parseName(ExpressionPartType);
        if (!node)
            return false;
        
    }
    while (currentIsOneOf(operators)) {
        advance();
        if (!(parseNodeQ(ExpressionPartType))) {
            return false;
        }
    } 
    return true;
}