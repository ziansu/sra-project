@org.junit.Test
public void testFindByWorkHoursWhenThereIsNoShifts() throws com.tsystems.javaschool.logiweb.dao.exceptions.DaoException, com.tsystems.javaschool.logiweb.service.exceptions.LogiwebServiceException {
    setupMocks();
    java.util.List<com.tsystems.javaschool.logiweb.entities.Driver> freeDrivers = setupDriverAndJournalsTestData();
    java.util.Set<com.tsystems.javaschool.logiweb.entities.Driver> result = driverService.findUnassignedToTrucksDriversByMaxWorkingHoursAndCity(null, 10);
    org.hamcrest.MatcherAssert.assertThat(result, org.hamcrest.Matchers.hasItem(freeDrivers.get(2)));
}