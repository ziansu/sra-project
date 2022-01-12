private void parseExpression() {
    terms = new java.util.ArrayList<Term>();
    int backIndex = 0;
    for (int i = 0; i < (input.length()); i++) {
        if (Calculator.isOperator(input.charAt(i))) {
            terms.add(new Term(input.substring(backIndex, i)));
            operators.add(input.charAt(i));
            backIndex = i + 1;
        }
    }
}