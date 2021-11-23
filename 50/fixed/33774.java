public void forDriver(final org.openqa.selenium.WebDriver driver) {
    if (!(driverMap.values().contains(driver))) {
        driverMap.put(driverName, driver);
    }
}