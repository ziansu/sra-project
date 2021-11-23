public void addFace(com.google.android.gms.vision.face.com.google.android.gms.samples.vision.face.facetracker.Face face) {
    face.initSound(getApplicationContext());
    com.google.android.gms.samples.vision.face.facetracker.FaceTrackerActivity.faces.add(face);
}