protected void copy(org.hl7.fhir.r4.context.SimpleWorkerContext other) {
    structures.putAll(other.structures);
    systems.addAll(other.systems);
    questionnaire = other.questionnaire;
    binaries.putAll(other.binaries);
    allowLoadingDuplicates = other.allowLoadingDuplicates;
    version = other.version;
    revision = other.revision;
    date = other.date;
    validatorFactory = other.validatorFactory;
}