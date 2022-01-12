public int[] runQualification(DefaultDriverGenome[] drivers, boolean withGUI) {
    Neat4SpeedDriver[] driversList = new Neat4SpeedDriver[(drivers.length) + 1];
    for (int i = 0; i < (drivers.length); i++) {
        driversList[i] = new Neat4SpeedDriver(null);
        driversList[i].loadGenome(drivers[i]);
    }
    return runQualification(driversList, withGUI);
}