@org.junit.Test
public void importConcept_shouldUpdateNameTypeInConcept() throws java.lang.Exception {
    org.openmrs.module.openconceptlab.client.OclConcept oclConcept = newOclConcept();
    importer.importConcept(new org.openmrs.module.openconceptlab.CacheService(conceptService), null, oclConcept);
    for (org.openmrs.module.openconceptlab.client.OclConcept.Name name : oclConcept.getNames()) {
        if ((name.getNameType()) == null) {
            name.setNameType(ConceptNameType.INDEX_TERM.toString());
        }
    }
    importer.importConcept(new org.openmrs.module.openconceptlab.CacheService(conceptService), null, oclConcept);
    assertImported(oclConcept);
}