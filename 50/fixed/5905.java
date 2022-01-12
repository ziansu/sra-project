public void onView(final com.qcadoo.mes.masterOrders.hooks.DataDefinition masterOrderProductDD, final com.qcadoo.mes.masterOrders.hooks.Entity masterOrderProduct) {
    countCumulativeOrderQuantity(masterOrderProduct);
    fillRegisteredQuantity(masterOrderProduct);
    calculateLeftToRelease(masterOrderProduct);
}