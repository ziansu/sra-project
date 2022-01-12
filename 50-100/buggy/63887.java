private java.util.List<java.lang.String> evaluateOrAndAnd(java.lang.String operand1, java.lang.String operand2) {
    final java.util.List<java.lang.String> res = new java.util.ArrayList<>();
    final java.lang.String[] splitOP1 = operand1.replaceAll("(\\()|(\\))", "").split("(\\&)|(\\|)");
    for (int i = 0; i < (splitOP1.length); i++) {
        final java.lang.String el = splitOP1[i];
        res.add(((operand2 + "&") + el));
    }
    return res;
}