public static com.ersoft.web.controller.business.vo.ActualCostTrueAdditionVo createActualCostTrueAdditionVo(com.ersoft.web.domain.business.cost.batch.ActualCostTrueAddition actualCostTrueAddition) {
    com.ersoft.web.controller.business.vo.ActualCostTrueAdditionVo vo = new com.ersoft.web.controller.business.vo.ActualCostTrueAdditionVo();
    vo.setId(actualCostTrueAddition.getId());
    vo.setActualCostBatchAdditionVo(com.ersoft.web.controller.business.vo.ActualCostBatchAdditionVo.createActualCostBatchAddition(actualCostTrueAddition.getActualCostBatchAddition()));
    vo.setAmount(actualCostTrueAddition.getAmount());
    if ((actualCostTrueAddition.getOperateDate()) != null)
        vo.setOperateDate(actualCostTrueAddition.getOperateDate().format(java.time.format.DateTimeFormatter.ISO_DATE));
    
    vo.setOperator(actualCostTrueAddition.getOperator());
    return vo;
}