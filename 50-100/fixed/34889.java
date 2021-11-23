@org.junit.Test
public void addressStreetNameIsABigCity() throws java.io.IOException, java.lang.InterruptedException {
    if ((countryTest.contains("FR")) || (countryTest.contains("ALL"))) {
        java.lang.String rawAddress = "rue de paris, dunkerque";
        com.gisgraphy.addressparser.AddressResultsDto addressResultsDto = doGeocodingOnCountry(rawAddress, "FR");
        net.sf.jstester.util.Assert.assertNotNull(addressResultsDto);
        isCorrectByAtLeastOneIds(new long[]{ 2428047946L , 2428047947L , 20944097L , 72518994L , 181223657L , 181224204L , 234781172L , 235661698L , 235661699L , 355469642L }, addressResultsDto.getResult(), rawAddress);
    }
}