public java.math.BigDecimal getSubContractPrice(com.ersoft.web.domain.business.contract.SubContract subContract) {
    java.math.BigDecimal price = java.math.BigDecimal.ZERO;
    if (subContract != null) {
        java.util.List<com.ersoft.web.domain.business.budget.contract.ContractBudget> contractBudgets = contractBudgetService.findActiveAll(com.ersoft.web.service.business.ContractBudgetPredicates.subContractBuggetPredicate(subContract), new org.springframework.data.domain.Sort(org.springframework.data.domain.Sort.Direction.DESC, "createdDate"));
        for (com.ersoft.web.domain.business.budget.contract.ContractBudget contractBudget : contractBudgets) {
            constructionBudgetCalculate(contractBudget);
            price.add(contractBudget.getTotalPrice());
        }
    }
    return price;
}