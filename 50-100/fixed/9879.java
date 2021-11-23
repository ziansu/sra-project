public void updateAirCondition() {
    java.util.List<java.lang.String> devices = deviceStatusDao.selectAllActiveDevices();
    java.util.List<model.CleanerStatus> cleanerStatusList = new java.util.ArrayList<model.CleanerStatus>();
    for (java.lang.String deviceID : devices) {
        model.CleanerStatus cleanerStatus = getCleanerStatus(deviceID);
        if ((cleanerStatus != null) && ((cleanerStatus.getDeviceID()) != null)) {
            cleanerStatusList.add(cleanerStatus);
        }
    }
    boolean update = deviceStatusDao.insertDeviceStatus(cleanerStatusList);
}