@java.lang.Override
public void onClick(android.view.View arg0) {
    com.stemmeter.stem_meter.SensorConfig config = new com.stemmeter.stem_meter.SensorConfig((finalPosition + 1));
    config.setFreq(sensorFragInterface.getSensorConfig((finalPosition + 1)).getFreq());
    if (sdCheck.isChecked()) {
        sdCheck.setChecked(false);
        config.setSDLogging(false);
    }else {
        sdCheck.setChecked(true);
        config.setSDLogging(true);
    }
    sensorFragInterface.sensorConfigWrite(config);
}