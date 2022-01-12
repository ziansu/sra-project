public void run() {
    for (int i = 0; i < 3; i++) {
        com.kamron.pogoiv.activities.OcrCalibrationResultActivity.sCalibrationImage = com.kamron.pogoiv.ScreenGrabber.getInstance().grabScreen();
        if ((com.kamron.pogoiv.activities.OcrCalibrationResultActivity.sCalibrationImage) != null) {
            android.content.Intent showResultIntent = new android.content.Intent(com.kamron.pogoiv.pokeflycomponents.GoIVNotificationManager.pokefly, com.kamron.pogoiv.activities.OcrCalibrationResultActivity.class).setFlags(((android.content.Intent.FLAG_ACTIVITY_NEW_TASK) | (android.content.Intent.FLAG_ACTIVITY_CLEAR_TASK)));
            startActivity(showResultIntent);
            break;
        }
    }
}