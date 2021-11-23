@org.junit.Test(expected = com.tsystems.javaschool.logiweb.service.exceptions.ServiceValidationException.class)
public void testEditDriverAndAccountNameWhenDriverIdMissing() throws com.tsystems.javaschool.logiweb.dao.exceptions.DaoException, com.tsystems.javaschool.logiweb.service.exceptions.LogiwebServiceException {
    com.tsystems.javaschool.logiweb.service.DriverService driverService = new com.tsystems.javaschool.logiweb.service.impl.DriverServiceImpl(driverDaoMock, truckDaoMock, shiftDaoMock, userServiceMock, userDaoMock);
    com.tsystems.javaschool.logiweb.model.DriverModel dm = new com.tsystems.javaschool.logiweb.model.DriverModel();
    driverService.editDriverAndAccountName(dm, null);
}