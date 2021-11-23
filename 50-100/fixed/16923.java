@org.junit.Test
public void testNubLookupEmptyStrings() {
    org.gbif.common.parsers.core.ParseResult<org.gbif.api.model.checklistbank.NameUsageMatch> result = org.gbif.occurrence.processor.interpreting.TaxonomyInterpreterTest.interpreter.match("", "", "", "", "", "", "", "", "", "", "", Rank.UNRANKED);
    assertNotNull(result);
    assertNotNull(result.getPayload());
    assertNull(result.getPayload().getScientificName());
}