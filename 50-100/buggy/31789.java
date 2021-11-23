@org.junit.Test
public void testNubLookupAllNulls() {
    org.gbif.common.parsers.core.ParseResult<org.gbif.api.model.checklistbank.NameUsageMatch> result = org.gbif.occurrence.processor.interpreting.TaxonomyInterpreterTest.interpreter.match(null, null, null, null, null, null, null, null, null, null, null, null);
    org.junit.Assert.assertNotNull(result);
    org.junit.Assert.assertNotNull(result.getPayload());
    org.junit.Assert.assertNull(result.getPayload().getScientificName());
}