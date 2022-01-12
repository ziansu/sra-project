private static boolean createLogFile() {
    java.io.File file = new java.io.File(com.lkworm.miniservice.GPSTrackService.getGPSLogPath());
    if ((file.exists()) == false) {
        try {
            file.createNewFile();
        } catch (java.io.IOException e) {
            com.lkworm.miniservice.GPSTrackService.LogError(("createLogFile" + (e.toString())));
            return false;
        }
    }
    file = null;
    return true;
}