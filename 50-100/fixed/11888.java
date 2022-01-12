@org.gbif.occurrence.persistence.Test
@org.gbif.occurrence.persistence.Ignore(value = "Identifiers removed from persistence until needed")
public void testGetNoIdentifiers() throws java.io.IOException {
    org.gbif.api.model.occurrence.Occurrence occ = occurrenceService.get(org.gbif.occurrence.persistence.OccurrencePersistenceServiceImplTest.KEY);
    assertEquivalence(occ);
    assertEquals(((java.lang.Integer) (org.gbif.occurrence.persistence.OccurrencePersistenceServiceImplTest.KEY)), occ.getKey());
    assertEquals(0, occ.getIdentifiers().size());
}