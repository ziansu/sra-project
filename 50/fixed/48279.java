public static com.krishagni.catissueplus.core.biospecimen.domain.SpecimenShipmentShippedEvent createForShipmentItem(com.krishagni.catissueplus.core.administrative.domain.ShipmentItem item) {
    com.krishagni.catissueplus.core.biospecimen.domain.SpecimenShipmentShippedEvent event = new com.krishagni.catissueplus.core.biospecimen.domain.SpecimenShipmentShippedEvent(item.getSpecimen());
    event.setId(item.getId());
    return event;
}