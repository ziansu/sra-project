@java.lang.Override
public void setSettings(java.util.Map<java.lang.String, java.lang.Object> settings) {
    try {
        calibFile = ((java.io.File) (settings.get(PanelKeys.KEY_CALIBRATION_FILENAME)));
        lblCalibration.setText(calibFile.getName());
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}