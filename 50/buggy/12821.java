public static com.querydsl.core.types.Predicate contractBudgetDetailPredicate(com.ersoft.web.domain.business.budget.contract.ContractBudgetDetail detail) {
    com.ersoft.web.domain.business.budget.construction.QConstructionBudget constructionBudget = com.ersoft.web.domain.business.budget.construction.QConstructionBudget.constructionBudget;
    return constructionBudget.contractBudgetDetail.eq(detail).and(com.ersoft.web.service.business.ConstructionBudgetPredicates.finished());
}