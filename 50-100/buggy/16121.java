@org.junit.Test
public void lookupITISSynonymFails() throws org.eol.globi.service.PropertyEnricherException {
    org.eol.globi.taxon.GlobalNamesService service = new org.eol.globi.taxon.GlobalNamesService();
    java.util.HashMap<java.lang.String, java.lang.String> props = new java.util.HashMap<java.lang.String, java.lang.String>();
    props.put(PropertyAndValueDictionary.NAME, "Corizidae");
    java.util.Map<java.lang.String, java.lang.String> enrich = service.enrich(props);
    org.junit.Assert.assertThat(enrich.get(PropertyAndValueDictionary.EXTERNAL_ID), org.hamcrest.Matchers.is("ITIS:108477"));
}