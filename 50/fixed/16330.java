@org.gbif.occurrence.persistence.Test
public void testGetNull() {
    org.gbif.api.model.occurrence.Occurrence occ = occurrenceService.get(org.gbif.occurrence.persistence.OccurrencePersistenceServiceImplTest.BAD_KEY);
    assertNull(occ);
}