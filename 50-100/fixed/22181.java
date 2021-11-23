private void evaluateLeftToRight(java.util.Stack<java.lang.Long> operands, java.util.Stack<java.lang.Character> operators) {
    char op = operators.pop();
    long a = operands.pop();
    long b = operands.pop();
    long val = evaluate(a, b, op);
    operands.add(val);
}