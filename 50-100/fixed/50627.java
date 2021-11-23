public void calibrate() {
    angle.ANGLE_CALIBRATION_VOLTAGE = angle.rawValue;
    com.spriton.therapypi.database.ConfigValue value = com.spriton.therapypi.database.DataAccess.getConfigValue("ANGLE_CALIBRATION_DEGREE");
    if (value == null) {
        value = new com.spriton.therapypi.database.ConfigValue();
        value.setConfigKey("ANGLE_CALIBRATION_DEGREE");
        value.setConfigValue(java.lang.Double.toString(angle.ANGLE_CALIBRATION_VOLTAGE));
        com.spriton.therapypi.database.DataAccess.saveConfigValue(value);
    }else {
        value.setConfigValue(java.lang.Double.toString(angle.ANGLE_CALIBRATION_VOLTAGE));
        com.spriton.therapypi.database.DataAccess.updateConfigValue(value);
    }
}