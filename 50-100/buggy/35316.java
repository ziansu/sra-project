public static boolean LogError(java.lang.String content) {
    if (com.lkworm.miniservice.GPSTrackService.createLogFile()) {
        java.io.FileWriter writer;
        try {
            writer = new java.io.FileWriter(com.lkworm.miniservice.GPSTrackService.getGPSLogPath(), true);
            writer.write(content);
            writer.close();
            writer = null;
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
    return true;
}