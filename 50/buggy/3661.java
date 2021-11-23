public java.util.regex.Pattern compile(java.lang.String expression) {
    java.lang.String regex = compileExpression(expression);
    pattern = java.util.regex.Pattern.compile(regex);
    return pattern;
}