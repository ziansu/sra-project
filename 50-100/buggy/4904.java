public java.math.BigDecimal getByContractBudgetDetailPrice(com.ersoft.web.domain.business.budget.contract.ContractBudgetDetail detail) {
    java.math.BigDecimal price = java.math.BigDecimal.ZERO;
    java.util.List<com.ersoft.web.domain.business.cost.batch.sec.ActualCostBatchSec> costs = com.google.common.collect.Lists.newArrayList();
    costs.addAll(findActiveAll(com.ersoft.web.service.business.ActualCostBatchSecPredicates.contractBudgetDetailPredicate(detail), new org.springframework.data.domain.Sort(org.springframework.data.domain.Sort.Direction.ASC, "operateDate")));
    for (com.ersoft.web.domain.business.cost.batch.sec.ActualCostBatchSec actualCostBatch : costs) {
        price = getDetailPrice(detail, price, actualCostBatch);
    }
    return price;
}