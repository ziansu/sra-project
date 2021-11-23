@org.junit.Test
public void findAllBetweenDates_shouldFindDateGivenSingleDayRange() {
    net.binarycreations.apod.domain.AstroPick expected = fromDate(net.binarycreations.apod.domain.dao.SqliteAstroPickDaoIntegrationTest.DATE_10_11_15);
    sut.insert(expected);
    java.util.List<net.binarycreations.apod.domain.AstroPick> actual = sut.findAllBetweenDates(net.binarycreations.apod.domain.dao.SqliteAstroPickDaoIntegrationTest.DATE_10_11_15, net.binarycreations.apod.domain.dao.SqliteAstroPickDaoIntegrationTest.DATE_10_11_15);
    assertEquals(1, actual.size());
    assertAstroPickEquals(expected, actual.get(0));
}