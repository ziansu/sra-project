@org.junit.Test
public void testExchanges() {
    java.io.InputStream in = getClass().getResourceAsStream("sdk_sample_process.xml");
    java.lang.Process p = javax.xml.bind.JAXB.unmarshal(in, java.lang.Process.class);
    org.junit.Assert.assertEquals(2, p.exchanges.size());
    org.junit.Assert.assertEquals(2, p.lciaResults.size());
}