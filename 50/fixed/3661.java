public java.util.regex.Pattern compile(java.lang.String expression) {
    java.lang.String regex = compileExpression(expression);
    java.lang.System.out.println(regex);
    pattern = java.util.regex.Pattern.compile(regex);
    return pattern;
}