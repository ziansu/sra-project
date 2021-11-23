@org.junit.Test
public void getFomentUnitDataTest() {
    java.time.LocalDate ufDate = java.time.LocalDate.now();
    java.util.Map<java.lang.String, cl.fatman.capital.fund.FomentUnit> ufMap = efData.getFomentUnitData(2016);
    assertThat("Foment unit map should not be greater than the days of the year.", ufMap.size(), greaterThan(((ufDate.getDayOfYear()) - 1)));
}