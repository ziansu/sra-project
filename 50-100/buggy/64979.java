@org.junit.Test
public void zipStreetTest() throws java.io.IOException, java.lang.InterruptedException {
    if ((countryTest.contains("FR")) || (countryTest.contains("ALL"))) {
        java.lang.String rawAddress = "75000 Place Vendôme";
        com.gisgraphy.addressparser.AddressResultsDto addressResultsDto = doGeocodingOnCountry(rawAddress, "FR");
        net.sf.jstester.util.Assert.assertNotNull(addressResultsDto);
        isCorrectByAtLeastOneIds(new java.lang.Long[]{ 4234145L , 4234144L , 4234146L }, addressResultsDto.getResult(), rawAddress);
    }
}