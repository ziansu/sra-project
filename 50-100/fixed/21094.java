public java.math.BigDecimal getContractBudgetDetailPrice(com.ersoft.web.domain.business.budget.contract.ContractBudgetDetail detail, java.lang.String category, java.lang.String id) {
    java.math.BigDecimal price = java.math.BigDecimal.ZERO;
    java.util.List<com.ersoft.web.domain.business.cost.batch.sec.ActualCostBatchSec> costs = findActiveAll(com.ersoft.web.service.business.ActualCostBatchSecPredicates.contractBudgetDetailAndItemCategoryPredicate(detail, category, id), new org.springframework.data.domain.Sort(org.springframework.data.domain.Sort.Direction.ASC, "operateDate"));
    for (com.ersoft.web.domain.business.cost.batch.sec.ActualCostBatchSec actualCostBatch : costs) {
        if ((actualCostBatch.getTotalPrice()) != null)
            price = price.add(getDetailPrice(detail, actualCostBatch));
        
    }
    return price;
}