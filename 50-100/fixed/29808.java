private void startDetectingAudio() {
    if ((ad) == null) {
        ad = new io.github.fbmediahack.quiethome.AudioDetector(getApplicationContext(), this);
    }
    int requestCode = 200;
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.M)) {
        requestPermissions(permissions, requestCode);
    }else {
        ad.start();
    }
}