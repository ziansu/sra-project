@org.gbif.occurrence.persistence.Test
public void testGetVerbatimNull() {
    org.gbif.api.model.occurrence.VerbatimOccurrence verb = occurrenceService.getVerbatim(org.gbif.occurrence.persistence.OccurrencePersistenceServiceImplTest.BAD_KEY);
    assertNull(verb);
}