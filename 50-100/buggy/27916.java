private static boolean isSomeTaxiAvailable() {
    Iterator i = Umer.vehicles.entrySet().iterator();
    while (i.hasNext()) {
        Vehicle curVehicle = i.next();
        if (((curVehicle.getDriver()) != null) && (curVehicle.getDriver.isAvailable())) {
            return true;
        }
    } 
    return false;
}