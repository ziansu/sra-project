public void uninitialize() {
    if ((mHandle) != 0) {
        com.thundersoft.hz.selfportrait.detect.FaceDetect.native_destroy(mHandle);
    }
}