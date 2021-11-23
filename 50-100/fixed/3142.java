@com.google.inject.persist.Transactional(rollbackOn = { com.axelor.exception.AxelorException.class , java.lang.Exception.class })
public void finish(com.axelor.apps.production.db.ManufOrder manufOrder) throws com.axelor.exception.AxelorException {
    if ((manufOrder.getOperationOrderList()) != null) {
        for (com.axelor.apps.production.db.OperationOrder operationOrder : manufOrder.getOperationOrderList()) {
            operationOrderWorkflowService.finish(operationOrder);
        }
    }
    manufOrderStockMoveService.finish(manufOrder);
    manufOrder.setStatusSelect(IManufOrder.STATUS_FINISHED);
    save(manufOrder);
}