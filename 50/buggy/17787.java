@org.junit.Test
public void testFragmentNull() {
    java.lang.String fragment = occurrenceService.getFragment(org.gbif.occurrence.persistence.OccurrencePersistenceServiceImplTest.BAD_KEY);
    org.junit.Assert.assertNull(fragment);
}