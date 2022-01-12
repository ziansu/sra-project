@java.lang.Override
protected java.lang.String preProcess(java.lang.String sourceCode) {
    java.lang.String temp = org.apache.commons.lang.StringUtils.trimToEmpty(sourceCode);
    if (!(temp.startsWith(KeyWord.WHILE)))
        throw new com.ecleague.parser.ast.exception.ParseSyntaxException(this, sourceCode);
    
    temp = com.ecleague.parser.ast.util.Util.trimTarget(temp, KeyWord.WHILE);
    temp = com.ecleague.parser.ast.util.Util.trimTarget(temp, Operators.LEFT_BRACKET);
    expression = new com.ecleague.parser.ast.expression.ExpressionImpl();
    temp = expression.parse(temp);
    return com.ecleague.parser.ast.util.Util.trimTarget(temp, Operators.RIGHT_BRACKET);
}