private void setEncounterType(org.openmrs.module.bahmniemrapi.encountertransaction.contract.BahmniEncounterTransaction bahmniEncounterTransaction) {
    if (org.apache.commons.lang3.StringUtils.isBlank(bahmniEncounterTransaction.getEncounterTypeUuid())) {
        org.openmrs.EncounterType encounterType = encounterTypeIdentifier.getEncounterTypeFor(bahmniEncounterTransaction.getEncounterType(), bahmniEncounterTransaction.getLocationUuid());
        if (encounterType == null) {
            throw new java.lang.RuntimeException("Encounter type not found.");
        }
        bahmniEncounterTransaction.setEncounterTypeUuid(encounterType.getUuid());
    }
}