private java.util.List<com.ersoft.web.controller.business.vo.ContractBudgetDetailCostInfoVo> getInfo(java.util.List<com.ersoft.web.domain.business.budget.contract.ContractBudgetDetail> details) {
    java.util.List<com.ersoft.web.controller.business.vo.ContractBudgetDetailCostInfoVo> vos = com.google.common.collect.Lists.newArrayList();
    for (com.ersoft.web.domain.business.budget.contract.ContractBudgetDetail detail : details) {
        com.ersoft.web.controller.business.vo.ContractBudgetDetailCostInfoVo vo = new com.ersoft.web.controller.business.vo.ContractBudgetDetailCostInfoVo();
        createBaseInfo(detail, vo);
        vo.setCostPriceInfo(actualCostTrueSecService.getPriceInfo(detail));
    }
    return vos;
}