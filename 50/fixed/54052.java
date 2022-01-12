private boolean isUnaryOperator(int position) {
    calculator.AbstractOperator test = operators.get(position);
    return this.isUnaryOperator(test);
}