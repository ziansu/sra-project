@org.springframework.web.bind.annotation.RequestMapping(value = "/history/{driverId}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String getDriverHistoryById(org.springframework.ui.Model model, @org.springframework.web.bind.annotation.RequestParam
java.util.Map<java.lang.String, java.lang.String> requestParam, @org.springframework.web.bind.annotation.PathVariable
int driverId) {
    com.teamd.taxi.controllers.driver.Driver driver = driverService.getDriver(driverId);
    setViewHistory(model, requestParam, driver);
    return "driver/drv-history";
}