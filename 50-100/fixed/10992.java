@org.junit.Test
public void importConcept_shouldAddNewDescriptionsToConcept() throws java.lang.Exception {
    org.openmrs.module.openconceptlab.client.OclConcept oclConcept = newOclConcept();
    importer.importConcept(new org.openmrs.module.openconceptlab.CacheService(conceptService), update, oclConcept);
    org.openmrs.module.openconceptlab.client.OclConcept.Description desc1 = new org.openmrs.module.openconceptlab.client.OclConcept.Description();
    desc1.setDescription("test oclConceptDescription");
    desc1.setLocale(org.openmrs.api.context.Context.getLocale());
    oclConcept.getDescriptons().add(desc1);
    importer.importConcept(new org.openmrs.module.openconceptlab.CacheService(conceptService), update, oclConcept);
    assertImported(oclConcept);
}