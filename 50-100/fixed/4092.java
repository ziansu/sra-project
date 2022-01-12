@org.junit.Test
public void testAddMarketingYear() {
    de.parkand.verschlag.schlag.MarketingYear year = new de.parkand.verschlag.schlag.MarketingYear();
    year.setIdentifier(1);
    year.setYear(2000);
    de.parkand.verschlag.schlag.Farm farm = new de.parkand.verschlag.schlag.Farm();
    farm.addMarketingYear(year);
    assertEquals(1, farm.getMarketingYears().size());
}