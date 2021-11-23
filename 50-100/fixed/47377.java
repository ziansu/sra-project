public static void main(java.lang.String[] args) {
    edu.ksu.operatingsystems.javaos.driver.DriverType driverType = edu.ksu.operatingsystems.javaos.driver.DriverType.FIFO;
    edu.ksu.operatingsystems.javaos.driver.OSDriver driver = new edu.ksu.operatingsystems.javaos.driver.OSDriver(driverType);
    edu.ksu.operatingsystems.javaos.main.Main.executeDriver(driver);
    edu.ksu.operatingsystems.javaos.util.StatHelper statHelper = new edu.ksu.operatingsystems.javaos.util.StatHelper();
    statHelper.totalStatsAndWriteToFile(driverType, driver.generateStats(), true);
    driverType = edu.ksu.operatingsystems.javaos.driver.DriverType.Priority;
    driver = new edu.ksu.operatingsystems.javaos.driver.OSDriver(driverType);
    edu.ksu.operatingsystems.javaos.main.Main.executeDriver(driver);
    statHelper.totalStatsAndWriteToFile(driverType, driver.generateStats(), false);
}