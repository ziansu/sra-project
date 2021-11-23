public static expression_parser.symbol.Variable execute(java.lang.String exp) throws java.lang.Exception {
    return expression_parser.ConditionParser.calc(expression_parser.ConditionParser.parse(exp));
}