public void update(org.openmrs.Encounter encounter, java.util.List<org.openmrs.module.emrapi.encounter.domain.EncounterTransaction.Observation> observations) {
    java.util.Set<org.openmrs.Obs> existingObservations = encounter.getObsAtTopLevel(false);
    for (org.openmrs.module.emrapi.encounter.domain.EncounterTransaction.Observation observationData : observations) {
        org.openmrs.Obs obsFound = this.obsMapper.getMatchingObservation(existingObservations, observationData.getUuid());
        encounter.addObs(this.obsMapper.transformEtObs(encounter, obsFound, observationData));
    }
}