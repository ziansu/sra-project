public java.util.Set<org.openqa.selenium.WebDriver> closeAllDrivers() {
    java.util.Collection<org.openqa.selenium.WebDriver> openDrivers = driverMap.values();
    java.util.Set<org.openqa.selenium.WebDriver> closedDrivers = new java.util.HashSet<org.openqa.selenium.WebDriver>(openDrivers);
    for (org.openqa.selenium.WebDriver driver : openDrivers) {
        closeAndQuit(driver);
    }
    driverMap.clear();
    currentDriver = null;
    return closedDrivers;
}