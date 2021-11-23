@org.gbif.occurrence.persistence.Test
public void testDeleteExists() throws java.io.IOException {
    org.gbif.api.model.occurrence.Occurrence occ = occurrenceService.delete(org.gbif.occurrence.persistence.OccurrencePersistenceServiceImplTest.KEY);
    assertEquivalence(occ);
    assertEquals(((java.lang.Integer) (org.gbif.occurrence.persistence.OccurrencePersistenceServiceImplTest.KEY)), occ.getKey());
    org.gbif.api.model.occurrence.Occurrence test = occurrenceService.get(org.gbif.occurrence.persistence.OccurrencePersistenceServiceImplTest.KEY);
    assertNull(test);
}