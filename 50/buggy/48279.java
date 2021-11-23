public static com.krishagni.catissueplus.core.biospecimen.domain.SpecimenShipmentShippedEvent createForShipmentItem(com.krishagni.catissueplus.core.administrative.domain.ShipmentItem item) {
    com.krishagni.catissueplus.core.biospecimen.domain.SpecimenShipmentShippedEvent event = new com.krishagni.catissueplus.core.biospecimen.domain.SpecimenShipmentShippedEvent(item.getSpecimen());
    item.setId(item.getId());
    return event;
}