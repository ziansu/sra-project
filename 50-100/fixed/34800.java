private static java.lang.String calculateParentheses(java.lang.String formula) {
    java.util.regex.Matcher parenthesesMatcher = com.shpp.vbaranchuk.cs.Assignment1.PARENTHESES_PATTERN.matcher(formula);
    return parenthesesMatcher.find() ? com.shpp.vbaranchuk.cs.Assignment1.calculateParentheses(formula.replace(parenthesesMatcher.group(), com.shpp.vbaranchuk.cs.Assignment1.calculate(parenthesesMatcher.group(1), parenthesesMatcher.group(2)))) : formula;
}