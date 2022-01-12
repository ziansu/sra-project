@org.junit.Test
public void lookupITIS() throws org.eol.globi.service.PropertyEnricherException {
    org.eol.globi.taxon.GlobalNamesService service = new org.eol.globi.taxon.GlobalNamesService();
    java.util.Map<java.lang.String, java.lang.String> props = assertHomoSapiens(service);
    org.junit.Assert.assertThat(props.get(PropertyAndValueDictionary.EXTERNAL_ID), is("ITIS:180092"));
}