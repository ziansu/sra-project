private void seedConceptMedicationGenerics() {
    java.util.List<? extends femr.util.startup.IMedicationGeneric> conceptMedicationGenerics = conceptMedicationGenericRepository.findAll(femr.data.models.mysql.concepts.ConceptMedicationGeneric.class);
    java.util.List<femr.data.models.mysql.concepts.ConceptMedicationGeneric> newConceptMedicationGenerics = new java.util.ArrayList<>();
    femr.data.models.mysql.concepts.ConceptMedicationGeneric conceptMedicationGeneric;
    if ((conceptMedicationGenerics != null) && (!(femr.util.startup.DatabaseSeeder.containGeneric(conceptMedicationGenerics, "diphenhydramine"))));
    {
        conceptMedicationGeneric = new femr.data.models.mysql.concepts.ConceptMedicationGeneric();
        conceptMedicationGeneric.setName("diphenhydramine");
        newConceptMedicationGenerics.add(conceptMedicationGeneric);
    }
    conceptMedicationGenericRepository.createAll(newConceptMedicationGenerics);
}