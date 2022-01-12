@org.junit.Test
public void cityCountryDetectionTest() throws java.io.IOException, java.lang.InterruptedException {
    if (countryTest.contains("ALL")) {
        java.lang.String rawAddress = "paris usa";
        com.gisgraphy.addressparser.AddressResultsDto addressResultsDto = doGeocodingOnCountry(rawAddress, "FR");
        net.sf.jstester.util.Assert.assertNotNull(addressResultsDto);
        isCorrectByAtLeastOneIds(new java.lang.Long[]{ 6678712L , 33299478L , 130722L , 140787L , 126166L , 197171L }, addressResultsDto.getResult(), rawAddress);
    }
}