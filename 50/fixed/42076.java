@java.lang.SuppressWarnings(value = "unchecked")
private boolean hasOrderOperationComponents(final com.qcadoo.model.api.Entity order) {
    return ((order.getField(com.qcadoo.mes.productionScheduling.NormOrderService.ORDER_OPERATION_COMPONENTS)) != null) && (!(((java.util.List<com.qcadoo.model.api.Entity>) (order.getField(com.qcadoo.mes.productionScheduling.NormOrderService.ORDER_OPERATION_COMPONENTS))).isEmpty()));
}