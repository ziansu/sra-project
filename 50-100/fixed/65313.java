@java.lang.Override
public void setSettings(java.util.Map<java.lang.String, java.lang.Object> settings) {
    try {
        calibFile = new java.io.File(((java.lang.String) (settings.get(PanelKeys.KEY_CALIBRATION_FILENAME))));
        lblCalibration.setText(calibFile.getName());
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}