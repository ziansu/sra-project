public void evaluationShouldBe(java.lang.String expression, java.lang.Object expected) throws java.lang.Exception {
    org.jspringbot.keyword.expression.ExpressionHelper.LOG.keywordAppender().appendArgument("Expected Result", expected);
    java.lang.Object value = silentEvaluate(expression);
    if ((expected == null) && (value == null)) {
        return ;
    }
    if (((expected == null) || (value == null)) || (!(silentEvaluate(expected).equals(value)))) {
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Evaluation '%s' was not expected.", expression));
    }
}