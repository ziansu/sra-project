public void run() {
    if ((com.kamron.pogoiv.ScreenGrabber.getInstance()) == null) {
        return ;
    }
    com.kamron.pogoiv.activities.OcrCalibrationResultActivity.sCalibrationImage = com.kamron.pogoiv.ScreenGrabber.getInstance().grabScreen();
    if ((com.kamron.pogoiv.activities.OcrCalibrationResultActivity.sCalibrationImage) != null) {
        android.content.Intent showResultIntent = new android.content.Intent(this, com.kamron.pogoiv.activities.OcrCalibrationResultActivity.class).setFlags(((android.content.Intent.FLAG_ACTIVITY_NEW_TASK) | (android.content.Intent.FLAG_ACTIVITY_CLEAR_TASK)));
        startActivity(showResultIntent);
    }
}