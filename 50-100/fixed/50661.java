@org.junit.Test
public void extractEAD() {
    org.junit.Assert.assertNotNull(de.uzk.hki.da.format.CTFileFormatFacadeExtractTests.fff);
    org.junit.Assert.assertTrue(de.uzk.hki.da.format.CTFileFormatFacadeExtractTests.fff.connectivityCheck());
    try {
        de.uzk.hki.da.format.CTFileFormatFacadeExtractTests.fff.extract(de.uzk.hki.da.utils.Path.makeFile(de.uzk.hki.da.format.CTFileFormatFacadeExtractTests.testRoot, "vda3.XML"), de.uzk.hki.da.utils.Path.makeFile(de.uzk.hki.da.format.CTFileFormatFacadeExtractTests.testRoot, "vda3.XML.output"));
    } catch (de.uzk.hki.da.format.ConnectionException e) {
        org.junit.Assert.fail();
    } catch (java.lang.Exception e) {
        org.junit.Assert.fail();
    }
}