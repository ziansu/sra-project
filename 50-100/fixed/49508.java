private static boolean isParenExpression(java.lang.String myInput, int myCurrentPosition) {
    java.util.regex.Matcher expMatcher = expressions.ParenExpression.EXPRESSION_BEGIN_REGEX.matcher(myInput.substring(myCurrentPosition));
    java.util.regex.Matcher overloadMatcher = expressions.ParenExpression.OVERLOADED_OPERATOR_REGEX.matcher(myInput.substring(myCurrentPosition));
    if (overloadMatcher.lookingAt()) {
        expressions.ParenExpression.isOperator = true;
    }else {
        expressions.ParenExpression.isOperator = false;
    }
    return (expMatcher.lookingAt()) || (overloadMatcher.lookingAt());
}