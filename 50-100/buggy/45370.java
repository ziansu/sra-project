public void start() {
    originalExpression = ei.getInput();
    while (!(originalExpression.equals("q"))) {
        terminal = scanExpression(originalExpression);
        java.lang.System.out.println(terminal);
        java.lang.System.out.println(terminalValues);
        int result = evaluateExpression();
        ro.displayResult(java.lang.String.format("%d", result));
        originalExpression = ei.getInput();
    } 
}