private budgeter.Expense getExpense(java.lang.String rawExpenseId) {
    if (rawExpenseId == null) {
        return null;
    }
    java.lang.Long expenseId;
    try {
        expenseId = java.lang.Long.parseLong(rawExpenseId);
    } catch (java.lang.ClassCastException e) {
        return null;
    }
    budgeter.Expense instance = new budgeter.Expense();
    budgeter.Expense expense = instance.getById(expenseId);
    if (expense == null) {
        return null;
    }
    return expense;
}