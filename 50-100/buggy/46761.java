@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    long budgetId = getArguments().getLong(com.flingsoftware.personalbudget.app.budgets.BudgetDetailsExpenses.BUDGET_ID);
    iconeVeloci = new com.flingsoftware.personalbudget.utilita.ListViewIconeVeloce(getActivity());
    new com.flingsoftware.personalbudget.app.budgets.BudgetDetailsExpenses.PlaceHolderWorkerTask().execute(R.drawable.tag_0);
    android.util.Log.d(com.flingsoftware.personalbudget.app.budgets.BudgetDetailsExpenses.TAG, "Fragments Expenses reload data");
    new com.flingsoftware.personalbudget.app.budgets.BudgetDetailsExpenses.GetExpensesTask().execute(budgetId);
}