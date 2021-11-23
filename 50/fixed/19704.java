@org.junit.Test
public void importConcept_shouldSaveNewConcept() throws java.lang.Exception {
    org.openmrs.module.openconceptlab.client.OclConcept oclConcept = newOclConcept();
    importer.importConcept(new org.openmrs.module.openconceptlab.CacheService(conceptService), update, oclConcept);
    assertImported(oclConcept);
}