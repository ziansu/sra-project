@org.junit.Test
public void lookupMultipleSources() throws org.eol.globi.service.PropertyEnricherException {
    org.eol.globi.taxon.GlobalNamesService service = new org.eol.globi.taxon.GlobalNamesService();
    final java.util.List<org.eol.globi.domain.Taxon> taxa = new java.util.ArrayList<org.eol.globi.domain.Taxon>();
    service.findTermsForNames(java.util.Arrays.asList("Homo sapiens"), new org.eol.globi.taxon.TermMatchListener() {
        @java.lang.Override
        public void foundTaxonForName(java.lang.Long id, java.lang.String name, org.eol.globi.domain.Taxon taxon, org.eol.globi.domain.NameType nameType) {
            taxa.add(taxon);
        }
    }, java.util.Arrays.asList(GlobalNamesSources.GBIF, GlobalNamesSources.ITIS));
    org.junit.Assert.assertThat(taxa.size(), is(2));
}