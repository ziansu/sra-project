@java.lang.Override
public com.google.android.gms.vision.Tracker<com.google.android.gms.vision.face.Face> create(com.google.android.gms.vision.face.Face face) {
    return new facetracker.donlingliang.facetrack.MainActivity.GraphicFaceTracker(mGraphicOverlay);
}