public static boolean hasSeveralCameras() {
    org.linphone.mediastream.video.capture.hwconf.AndroidCameraConfiguration.initCamerasCache();
    return (org.linphone.mediastream.video.capture.hwconf.AndroidCameraConfiguration.camerasCache.length) > 1;
}