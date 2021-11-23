private static void updateExpressionHistory(java.lang.String newExpression) {
    if ((com.calc.ExpressionHistory.getCurrEntry()) == ((com.calc.ExpressionHistory.getSize()) - 1)) {
        com.calc.ExpressionHistory.setEntry(newExpression);
    }else {
        com.calc.ExpressionHistory.appendEntry(newExpression);
    }
    ExpressionHistory.refreshDisplay = true;
}