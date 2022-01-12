private com.google.javascript.jscomp.parsing.parser.trees.ParseTree completeAssignmentExpressionParseAtArrow(com.google.javascript.jscomp.parsing.parser.trees.ParseTree leftOfArrow, com.google.javascript.jscomp.parsing.parser.Parser.Expression expressionIn) {
    if ((leftOfArrow.type) == (com.google.javascript.jscomp.parsing.parser.trees.ParseTreeType.CALL_EXPRESSION)) {
        return completeAssignmentExpressionParseAtArrow(leftOfArrow.asCallExpression());
    }else {
        return completeArrowFunctionParseAtArrow(leftOfArrow, expressionIn);
    }
}