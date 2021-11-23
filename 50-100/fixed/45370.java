public void start() {
    originalExpression = ei.getInput();
    while (!(originalExpression.equals("q"))) {
        terminal = scanExpression(originalExpression);
        int result = evaluateExpression();
        ro.displayResult(java.lang.String.format("%d", result));
        originalExpression = ei.getInput();
    } 
}