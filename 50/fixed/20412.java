public static boolean hasSeveralCameras() {
    org.linphone.mediastream.video.capture.hwconf.AndroidCameraConfiguration.initCamerasCache(true);
    return (org.linphone.mediastream.video.capture.hwconf.AndroidCameraConfiguration.camerasCache.length) > 1;
}