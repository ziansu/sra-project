@java.lang.Override
public void reloadData() {
    android.util.Log.d(com.flingsoftware.personalbudget.app.budgets.BudgetDetailsHistory.TAG, "Fragment History reload data");
    new com.flingsoftware.personalbudget.app.budgets.BudgetDetailsHistory.GetBudgetHistoryTask().execute(budgetId);
}