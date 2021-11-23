@org.junit.Test
public void lookupWORMS() throws org.eol.globi.service.PropertyEnricherException {
    org.eol.globi.taxon.GlobalNamesService service = new org.eol.globi.taxon.GlobalNamesService(org.eol.globi.taxon.GlobalNamesSources.WORMS);
    java.util.HashMap<java.lang.String, java.lang.String> props = new java.util.HashMap<java.lang.String, java.lang.String>();
    props.put(PropertyAndValueDictionary.NAME, "Anura");
    java.util.Map<java.lang.String, java.lang.String> enrich = service.enrich(props);
    org.junit.Assert.assertThat(enrich.get(PropertyAndValueDictionary.NAME), org.hamcrest.Matchers.is(org.hamcrest.CoreMatchers.nullValue()));
}