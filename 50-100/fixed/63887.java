private java.util.List<java.lang.String> evaluateOrAndAnd(final java.lang.String operand1, final java.lang.String operand2) {
    final java.util.List<java.lang.String> res = new java.util.ArrayList<>();
    final java.lang.String[] splitOP1 = operand1.replaceAll("(\\()|(\\))", "").split("(\\&)|(\\|)");
    for (final java.lang.String el : splitOP1) {
        res.add(((operand2 + "&") + el));
    }
    return res;
}