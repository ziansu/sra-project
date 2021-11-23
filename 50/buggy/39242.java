public void initialize() {
    try {
        mHandle = com.thundersoft.hz.selfportrait.detect.FaceDetect.native_create();
    } catch (java.lang.UnsatisfiedLinkError e) {
        e.printStackTrace();
        android.util.Log.e(com.thundersoft.hz.selfportrait.detect.FaceDetect.TAG, "could not link native handle for ts_detected_face_jni library!");
    }
}