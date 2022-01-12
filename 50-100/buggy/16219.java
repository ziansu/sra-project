public eu.europa.ec.fisheries.uvms.rules.service.constants.FishingGearCharacteristicCode retrieveGearCharacteristicCode(un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._20.GearCharacteristic gearCharacteristic) {
    if (gearCharacteristic == null) {
        return null;
    }
    try {
        eu.europa.ec.fisheries.uvms.rules.service.constants.FishingGearCharacteristicCode fishingGearCharacteristicCode = eu.europa.ec.fisheries.uvms.rules.service.constants.FishingGearCharacteristicCode.valueOf(gearCharacteristic.getTypeCode().getValue());
        return fishingGearCharacteristicCode;
    } catch (java.lang.IllegalArgumentException | java.lang.NullPointerException exc) {
        return null;
    }
}