public static boolean hasFrontCamera() {
    org.linphone.mediastream.video.capture.hwconf.AndroidCameraConfiguration.initCamerasCache(true);
    for (org.linphone.mediastream.video.capture.hwconf.AndroidCameraConfiguration.AndroidCamera cam : org.linphone.mediastream.video.capture.hwconf.AndroidCameraConfiguration.camerasCache) {
        if (cam.frontFacing)
            return true;
        
    }
    return false;
}