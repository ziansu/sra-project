public com.axelor.apps.production.db.OperationOrder finish(com.axelor.apps.production.db.OperationOrder operationOrder) throws com.axelor.exception.AxelorException {
    operationOrderStockMoveService.finish(operationOrder);
    operationOrder.setRealEndDateT(today);
    operationOrder.setStatusSelect(IOperationOrder.STATUS_FINISHED);
    return operationOrder;
}