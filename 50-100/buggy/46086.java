public static int availableCameras() {
    com.ideastormsoftware.presmedia.sources.Camera.cameraInfo.clear();
    de.humatic.dsj.DSFilterInfo[][] filterInfo = de.humatic.dsj.DSCapture.queryDevices();
    for (de.humatic.dsj.DSFilterInfo capInfo : filterInfo[0]) {
        if (!("none".equals(capInfo.getCLSID()))) {
            com.ideastormsoftware.presmedia.sources.Camera.cameraInfo.add(capInfo);
        }
    }
    return com.ideastormsoftware.presmedia.sources.Camera.cameraInfo.size();
}