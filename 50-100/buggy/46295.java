private com.google.javascript.jscomp.parsing.parser.trees.ParseTree completeAssignmentExpressionParseAtArrow(com.google.javascript.jscomp.parsing.parser.trees.CallExpressionTree callExpression, com.google.javascript.jscomp.parsing.parser.Parser.Expression expressionIn) {
    com.google.javascript.jscomp.parsing.parser.trees.ParseTree operand = callExpression.operand;
    com.google.javascript.jscomp.parsing.parser.trees.ParseTree arguments = callExpression.arguments;
    com.google.javascript.jscomp.parsing.parser.trees.ParseTree result;
    if ((operand.location.end.line) < (arguments.location.start.line)) {
        resetScannerAfter(operand);
        result = operand;
    }else {
        reportError("'=>' unexpected");
        result = callExpression;
    }
    return result;
}