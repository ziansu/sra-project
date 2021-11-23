@java.lang.Override
public void onResume() {
    super.onResume();
    if (!(com.stemmeter.stem_meter.SensorsFragment.hasReadSensorConfig)) {
        sensorFragInterface.updateBaseUnitTime();
        sensorFragInterface.readSensorConfigData();
        com.stemmeter.stem_meter.SensorsFragment.hasReadSensorConfig = true;
    }
}