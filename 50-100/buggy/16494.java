@org.junit.Test
public void testRemoveMarketingYear() {
    de.parkand.verschlag.schlag.MarketingYear year = new de.parkand.verschlag.schlag.MarketingYear();
    year.setIdentifier(1);
    year.setYear(java.time.Year.of(2000));
    de.parkand.verschlag.schlag.Farm farm = new de.parkand.verschlag.schlag.Farm();
    java.util.List<de.parkand.verschlag.schlag.MarketingYear> list = new java.util.ArrayList<>();
    list.add(year);
    farm.setMarketingYears(list);
    farm.removeMarketingYear(2000);
    assertEquals(0, farm.getMarketingYears().size());
}