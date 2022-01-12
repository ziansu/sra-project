@org.junit.Test
@org.junit.Ignore
public void exactMatchExcludeStrains() throws org.eol.globi.data.NodeFactoryException, org.eol.globi.service.PropertyEnricherException {
    taxonIndex.getOrCreateTaxon(new org.eol.globi.domain.TaxonImpl("Phytophthora infestans", null));
    new org.eol.globi.tool.LinkerGlobalNames(getGraphDb()).link();
    java.util.Collection<java.lang.String> ids = org.eol.globi.tool.LinkerTestUtil.assertHasOther("Phytophthora infestans", 6, taxonIndex, RelTypes.SAME_AS);
    org.junit.Assert.assertThat(ids, org.junit.matchers.JUnitMatchers.hasItem("NCBI:4787"));
    org.junit.Assert.assertThat(ids, org.hamcrest.CoreMatchers.not(org.junit.matchers.JUnitMatchers.hasItem("NCBI:403677")));
}