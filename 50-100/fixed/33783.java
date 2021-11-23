public eu.europa.ec.fisheries.uvms.rules.service.constants.FishingGearTypeCode retrieveFishingGearTypeCode(eu.europa.ec.fisheries.uvms.rules.service.business.fact.CodeType fishingGearTypeCode) {
    if ((fishingGearTypeCode == null) || (org.apache.commons.lang3.StringUtils.isBlank(fishingGearTypeCode.getValue()))) {
        return null;
    }
    try {
        return eu.europa.ec.fisheries.uvms.rules.service.constants.FishingGearTypeCode.valueOf(fishingGearTypeCode.getValue());
    } catch (java.lang.IllegalArgumentException | java.lang.NullPointerException exc) {
        return null;
    }
}