@org.junit.Test
public void testNubLookupAllNulls() {
    org.gbif.common.parsers.core.ParseResult<org.gbif.api.model.checklistbank.NameUsageMatch> result = org.gbif.occurrence.processor.interpreting.TaxonomyInterpreterTest.interpreter.match(null, null, null, null, null, null, null, null, null, null, null, null);
    assertNotNull(result);
    assertNotNull(result.getPayload());
    assertNull(result.getPayload().getScientificName());
}