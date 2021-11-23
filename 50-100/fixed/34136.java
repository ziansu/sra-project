public double peek(int n, double def) {
    if ((n < 0) || ((operandStack.size()) <= n)) {
        return def;
    }
    return operandStack.get((((operandStack.size()) - n) - 1));
}