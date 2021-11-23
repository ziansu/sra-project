public void ship() {
    if (isShipped()) {
        throw com.krishagni.catissueplus.core.common.errors.OpenSpecimenException.userError(ShipmentErrorCode.ALREADY_SHIPPED);
    }
    if (org.apache.commons.collections.CollectionUtils.isEmpty(getShipmentItems())) {
        throw com.krishagni.catissueplus.core.common.errors.OpenSpecimenException.userError(ShipmentErrorCode.NO_SPECIMENS_TO_SHIP);
    }
    for (com.krishagni.catissueplus.core.administrative.domain.ShipmentItem item : getShipmentItems()) {
        item.ship();
    }
    setStatus(com.krishagni.catissueplus.core.administrative.domain.Shipment.Status.SHIPPED);
}