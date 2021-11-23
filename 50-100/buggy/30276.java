@java.lang.Override
public void onStartup(com.whizzosoftware.hobson.api.property.PropertyContainer config) {
    java.lang.Double currentTempC = initialData.getCurrentTemperature();
    java.lang.Double targetTempC = initialData.getTargetTemperature();
    long now = java.lang.System.currentTimeMillis();
    publishVariable(VariableConstants.INDOOR_TEMP_C, currentTempC, HobsonVariable.Mask.READ_ONLY, now);
    publishVariable(VariableConstants.INDOOR_TEMP_F, convertCelsiusToFahrenheit(currentTempC), HobsonVariable.Mask.READ_ONLY, now);
    publishVariable(VariableConstants.TARGET_TEMP_C, targetTempC, HobsonVariable.Mask.READ_WRITE, now);
    publishVariable(VariableConstants.TARGET_TEMP_F, convertCelsiusToFahrenheit(targetTempC), HobsonVariable.Mask.READ_WRITE, now);
}