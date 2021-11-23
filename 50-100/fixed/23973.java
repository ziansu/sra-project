public void pause() {
    if ((nfcAdapter) != null) {
        nfcAdapter.disableForegroundDispatch(this);
    }
    org.catrobat.catroid.formulaeditor.SensorHandler.stopSensorListeners();
    org.catrobat.catroid.stage.StageActivity.stageListener.menuPause();
    org.catrobat.catroid.utils.LedUtil.pauseLed();
    org.catrobat.catroid.utils.VibratorUtil.pauseVibrator();
    org.catrobat.catroid.facedetection.FaceDetectionHandler.pauseFaceDetection();
    org.catrobat.catroid.common.ServiceProvider.getService(CatroidService.BLUETOOTH_DEVICE_SERVICE).pause();
}