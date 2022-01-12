public eu.europa.ec.fisheries.uvms.rules.service.constants.FishingGearCharacteristicCode retrieveGearCharacteristicCode(un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._20.GearCharacteristic gearCharacteristic) {
    if (gearCharacteristic == null) {
        return null;
    }
    try {
        return eu.europa.ec.fisheries.uvms.rules.service.constants.FishingGearCharacteristicCode.valueOf(gearCharacteristic.getTypeCode().getValue());
    } catch (java.lang.IllegalArgumentException | java.lang.NullPointerException exc) {
        return null;
    }
}