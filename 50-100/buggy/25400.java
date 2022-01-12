@java.lang.SuppressWarnings(value = { "deprecation" , "unchecked" })
private java.util.Set<org.openmrs.Obs> getHeadCircumferenceConceptObsForAPatient(org.openmrs.Patient patient) {
    org.openmrs.Concept headCircumferenceConcept = new org.openmrs.module.isanteplus.IsantePlusGlobalProps().HEAD_CIRCUMFERENC_CONCEPT;
    return ((java.util.Set<org.openmrs.Obs>) (headCircumferenceConcept != null ? org.openmrs.api.context.Context.getObsService().getObservationsByPersonAndConcept(patient, headCircumferenceConcept) : null));
}