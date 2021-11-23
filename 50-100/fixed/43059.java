@org.junit.Test
public void lookupITISSynonymSuccess() throws org.eol.globi.service.PropertyEnricherException {
    org.eol.globi.taxon.GlobalNamesService service = new org.eol.globi.taxon.GlobalNamesService();
    java.util.HashMap<java.lang.String, java.lang.String> props = new java.util.HashMap<java.lang.String, java.lang.String>();
    props.put(PropertyAndValueDictionary.NAME, "Arius felis");
    java.util.Map<java.lang.String, java.lang.String> enrich = service.enrich(props);
    org.junit.Assert.assertThat(enrich.get(PropertyAndValueDictionary.EXTERNAL_ID), is("ITIS:680665"));
    org.junit.Assert.assertThat(enrich.get(PropertyAndValueDictionary.NAME), is("Ariopsis felis"));
}