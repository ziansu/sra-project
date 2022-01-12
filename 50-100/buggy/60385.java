private void refreshExpenseList() {
    martinigt.einfachsparen.data.ExpenseDbHelper expenseDbHelper = new martinigt.einfachsparen.data.ExpenseDbHelper(dbHelper);
    martinigt.einfachsparen.data.PeriodDbHelper periodDbHelper = new martinigt.einfachsparen.data.PeriodDbHelper(dbHelper);
    martinigt.einfachsparen.model.Period currentPeriod = periodDbHelper.getCurrentPeriod();
    java.util.ArrayList<martinigt.einfachsparen.model.Expense> expenses = expenseDbHelper.getAllExpensesForPeriod(currentPeriod.getId(), true);
    expenseAdapter = new martinigt.einfachsparen.data.TransactionAdapter(this, martinigt.einfachsparen.helper.Helper.castToTransactionList(expenses));
    expenseList.setAdapter(expenseAdapter);
}