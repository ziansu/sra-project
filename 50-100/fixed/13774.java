@org.junit.Test
public void importConcept_shouldUnretireConcept() throws java.lang.Exception {
    org.openmrs.module.openconceptlab.client.OclConcept oclConcept = newOclConcept();
    oclConcept.setRetired(true);
    org.junit.Assert.assertTrue(oclConcept.isRetired());
    importer.importConcept(new org.openmrs.module.openconceptlab.CacheService(conceptService), update, oclConcept);
    oclConcept.setRetired(false);
    importer.importConcept(new org.openmrs.module.openconceptlab.CacheService(conceptService), update, oclConcept);
    org.openmrs.Concept concept = assertImported(oclConcept);
    org.junit.Assert.assertFalse(concept.isRetired());
}