private void copyArrayData() {
    for (int i = 0; i < (didio.configurator.panels.SensorPanel.NUM_SENSORS); i++) {
        for (int k = 0; k <= (didio.configurator.panels.SensorPanel.NUM_VALUES); k++) {
            sensor_array_copy[i][k] = MainFrame.cD.get(MainFrame.profileSelected).sensor.get()[i][k];
        }
    }
    sensor_copy_number = MainFrame.cD.get(MainFrame.profileSelected).sensor.getCount();
}