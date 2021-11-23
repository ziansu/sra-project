@java.lang.Override
public void onResume() {
    super.onResume();
    sensorFragInterface.updateBaseUnitTime();
    sensorFragInterface.readSensorConfigData();
}