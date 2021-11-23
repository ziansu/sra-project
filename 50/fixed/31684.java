@java.lang.Override
public java.util.List<com.rcmapps.smartwallet.db.Expense> getExpenseHistory() {
    return expenseDao.loadAll();
}