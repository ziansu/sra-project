private static com.querydsl.core.types.Predicate outsourcingPredicate(java.lang.Integer outsourcing) {
    com.ersoft.web.domain.business.budget.construction.QConstructionBudget constructionBudget = com.ersoft.web.domain.business.budget.construction.QConstructionBudget.constructionBudget;
    return constructionBudget.outsourcing.eq(outsourcing);
}