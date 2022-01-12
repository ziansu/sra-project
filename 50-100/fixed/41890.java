private int evaluateTerm() {
    int factorValue = evaluateFactor();
    if ((terminal.peek()) == '*') {
        terminal.pop();
        return (evaluateTerm()) * factorValue;
    }
    if ((terminal.peek()) == '/') {
        if (factorValue == 0) {
            ro.displayResult("Division by zero");
            throw new java.lang.IllegalArgumentException("Division by zero");
        }
        terminal.pop();
        return (evaluateTerm()) / factorValue;
    }
    return factorValue;
}