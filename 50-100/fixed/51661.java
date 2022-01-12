private org.kuali.coeus.common.budget.framework.query.QueryList<org.kuali.coeus.common.budget.framework.nonpersonnel.BudgetLineItem> getLineItemsFilteredByCostElement(org.kuali.coeus.common.budget.framework.period.BudgetPeriod budgetPeriod, java.lang.String costElement) {
    org.kuali.coeus.common.budget.framework.query.QueryList<org.kuali.coeus.common.budget.framework.nonpersonnel.BudgetLineItem> lineItemQueryList = new org.kuali.coeus.common.budget.framework.query.QueryList();
    lineItemQueryList.addAll(budgetPeriod.getBudgetLineItems());
    org.kuali.coeus.common.budget.framework.query.operator.Equals costElementEquals = new org.kuali.coeus.common.budget.framework.query.operator.Equals("costElement", costElement);
    org.kuali.coeus.common.budget.framework.query.QueryList<org.kuali.coeus.common.budget.framework.nonpersonnel.BudgetLineItem> periodLineItemCostElementQueryList = lineItemQueryList.filter(costElementEquals);
    return periodLineItemCostElementQueryList;
}