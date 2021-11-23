@org.junit.Test
public void testFindByWorkHoursExpectMultipleResuts() throws com.tsystems.javaschool.logiweb.dao.exceptions.DaoException, com.tsystems.javaschool.logiweb.service.exceptions.LogiwebServiceException {
    setupMocks();
    java.util.List<com.tsystems.javaschool.logiweb.entities.Driver> freeDrivers = setupDriverAndJournalsTestData();
    java.util.Set<com.tsystems.javaschool.logiweb.entities.Driver> result = driverService.findUnassignedToTrucksDriversByMaxWorkingHoursAndCity(null, 13);
    org.hamcrest.MatcherAssert.assertThat(result, org.hamcrest.Matchers.hasItems(freeDrivers.get(1), freeDrivers.get(2), freeDrivers.get(3)));
}