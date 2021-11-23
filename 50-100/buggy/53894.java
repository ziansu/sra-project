@java.lang.Override
public void calculateBudget(org.kuali.coeus.common.budget.impl.calculator.Budget budget) {
    java.util.List<org.kuali.coeus.common.budget.framework.period.BudgetPeriod> budgetPeriods = budget.getBudgetPeriods();
    for (org.kuali.coeus.common.budget.framework.period.BudgetPeriod budgetPeriod : budgetPeriods) {
        calculateBudgetPeriod(budget, budgetPeriod);
    }
    if ((budgetPeriods != null) && (!(budgetPeriods.isEmpty()))) {
        syncCostsToBudget(budget);
    }
}