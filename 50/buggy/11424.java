public static org.linphone.mediastream.video.capture.hwconf.AndroidCameraConfiguration.AndroidCamera[] retrieveCameras() {
    org.linphone.mediastream.video.capture.hwconf.AndroidCameraConfiguration.initCamerasCache();
    return org.linphone.mediastream.video.capture.hwconf.AndroidCameraConfiguration.camerasCache;
}