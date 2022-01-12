@org.junit.Test
public void testContainsMarketingYearTrue() {
    de.parkand.verschlag.schlag.MarketingYear year = new de.parkand.verschlag.schlag.MarketingYear();
    year.setIdentifier(0);
    year.setYear(2000);
    de.parkand.verschlag.schlag.Farm farm = new de.parkand.verschlag.schlag.Farm();
    farm.addMarketingYear(year);
    assertTrue(farm.containsMarketingYear(2000));
}