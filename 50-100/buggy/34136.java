public double peek(int n, double def) {
    if ((operandStack.size()) < n) {
        return def;
    }
    return operandStack.get((((operandStack.size()) - n) - 1));
}