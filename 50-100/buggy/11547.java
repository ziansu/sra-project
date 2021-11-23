@org.junit.Test
public void importConcept_shouldRetireConcept() throws java.lang.Exception {
    org.openmrs.module.openconceptlab.client.OclConcept oclConcept = newOclConcept();
    org.junit.Assert.assertFalse(oclConcept.isRetired());
    importer.importConcept(new org.openmrs.module.openconceptlab.CacheService(conceptService), null, oclConcept);
    oclConcept.setRetired(true);
    importer.importConcept(new org.openmrs.module.openconceptlab.CacheService(conceptService), null, oclConcept);
    org.openmrs.Concept concept = assertImported(oclConcept);
    org.junit.Assert.assertTrue(concept.isRetired());
}