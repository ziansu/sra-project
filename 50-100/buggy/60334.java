private void evaluate(java.util.Stack<java.lang.Long> operands, java.util.Stack<java.lang.Character> operators) {
    char op = operators.pop();
    long a = operands.pop();
    long b = operands.pop();
    long val = evaluate(b, a, op);
    java.lang.System.out.println((((((" - evaluating " + b) + op) + a) + "=") + val));
    java.lang.System.out.println((" - adding " + val));
    operands.add(val);
}