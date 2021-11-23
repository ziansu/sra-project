@org.junit.Test
public void testGetMarketingYear() {
    de.parkand.verschlag.schlag.MarketingYear year = new de.parkand.verschlag.schlag.MarketingYear();
    year.setIdentifier(0);
    year.setYear(java.time.Year.of(2000));
    de.parkand.verschlag.schlag.Farm farm = new de.parkand.verschlag.schlag.Farm();
    farm.addMarketingYear(year);
    assertEquals(year, farm.getMarketingYear(2000));
}