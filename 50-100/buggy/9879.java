public void updateAirCondition() {
    java.util.List<java.lang.String> devices = deviceStatusDao.selectAllActiveDevices();
    java.util.List<model.CleanerStatus> cleanerStatusList = new java.util.ArrayList<model.CleanerStatus>();
    for (java.lang.String deviceID : devices) {
        java.lang.String chipID = deviceIDToChipID(deviceID);
        model.CleanerStatus cleanerStatus = getCleanerStatus(chipID);
        if ((cleanerStatus != null) && ((cleanerStatus.getDeviceID()) != null)) {
            cleanerStatusList.add(cleanerStatus);
        }
    }
    boolean update = deviceStatusDao.insertDeviceStatus(cleanerStatusList);
}