@java.lang.Override
public void reloadData() {
    new com.flingsoftware.personalbudget.app.budgets.BudgetDetailsData.GetBudgetDetailsTask().execute(budget.getId());
}