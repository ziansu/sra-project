@java.lang.Override
public java.util.List<com.rcmapps.smartwallet.db.Expense> getExpenseHistory() {
    java.util.List<com.rcmapps.smartwallet.db.Expense> expenses = expenseDao.loadAll();
    if (expenses == null) {
        expenses = new java.util.ArrayList<>();
    }
    return expenses;
}