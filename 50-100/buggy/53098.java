private static void updateExpressionHistory(java.lang.String newExpression) {
    if ((com.calc.ExpressionHistory.getCurrEntry()) == ((com.calc.ExpressionHistory.getSize()) - 1)) {
        com.calc.ExpressionHistory.setEntry(newExpression);
    }else {
        com.calc.ExpressionHistory.appendEntry(newExpression);
        com.calc.InputHandler.currIndex = com.calc.ExpressionHistory.getEntry().length();
    }
    ExpressionHistory.refreshDisplay = true;
}