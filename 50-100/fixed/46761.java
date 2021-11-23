@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    long budgetId = getArguments().getLong(com.flingsoftware.personalbudget.app.budgets.BudgetDetailsExpenses.BUDGET_ID);
    iconeVeloci = new com.flingsoftware.personalbudget.utilita.ListViewIconeVeloce(getActivity());
    new com.flingsoftware.personalbudget.app.budgets.BudgetDetailsExpenses.PlaceHolderWorkerTask().execute(R.drawable.tag_0);
    new com.flingsoftware.personalbudget.app.budgets.BudgetDetailsExpenses.GetExpensesTask().execute(budgetId);
}