@org.junit.Test
@org.junit.Ignore(value = "Identifiers removed from persistence until needed")
public void testGetNoIdentifiers() throws java.io.IOException {
    org.gbif.api.model.occurrence.Occurrence occ = occurrenceService.get(org.gbif.occurrence.persistence.OccurrencePersistenceServiceImplTest.KEY);
    assertEquivalence(occ);
    org.junit.Assert.assertEquals(((java.lang.Integer) (org.gbif.occurrence.persistence.OccurrencePersistenceServiceImplTest.KEY)), occ.getKey());
    org.junit.Assert.assertEquals(0, occ.getIdentifiers().size());
}