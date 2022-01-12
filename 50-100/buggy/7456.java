@org.junit.Test
public void cityAdm() throws java.io.IOException, java.lang.InterruptedException {
    if ((countryTest.contains("FR")) || (countryTest.contains("ALL"))) {
        java.lang.String rawAddress = "saint omer normandie";
        com.gisgraphy.addressparser.AddressResultsDto addressResultsDto = doGeocodingOnCountry(rawAddress, "FR");
        net.sf.jstester.util.Assert.assertNotNull(addressResultsDto);
        isCorrectByAtLeastOneIds(new java.lang.Long[]{ 4039279022L , 94401L }, addressResultsDto.getResult(), rawAddress);
    }
}