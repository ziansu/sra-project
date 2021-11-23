public void removeFace(int id) {
    if ((com.google.android.gms.samples.vision.face.facetracker.FaceTrackerActivity.faces.get(id)) != null) {
        com.google.android.gms.samples.vision.face.facetracker.FaceTrackerActivity.faces.get(id).stopSound();
        com.google.android.gms.samples.vision.face.facetracker.FaceTrackerActivity.faces.remove(id);
    }
}