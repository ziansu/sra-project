public void pause() {
    org.catrobat.catroid.formulaeditor.SensorHandler.stopSensorListeners();
    org.catrobat.catroid.stage.StageActivity.stageListener.menuPause();
    if ((nfcAdapter) != null) {
        android.util.Log.d(org.catrobat.catroid.stage.StageActivity.TAG, "onPause()disableForegroundDispatch()");
        nfcAdapter.disableForegroundDispatch(this);
    }
    org.catrobat.catroid.utils.LedUtil.pauseLed();
    org.catrobat.catroid.utils.VibratorUtil.pauseVibrator();
    org.catrobat.catroid.facedetection.FaceDetectionHandler.pauseFaceDetection();
    org.catrobat.catroid.common.ServiceProvider.getService(CatroidService.BLUETOOTH_DEVICE_SERVICE).pause();
}