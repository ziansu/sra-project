public void run() {
    java.lang.Integer bayValue = ((phidgetNumber) * 8) + (sensorIndex);
    java.lang.Integer updatedValue = 0;
    if ((rack.bays) != null) {
        updatedValue = (sensorVal) + (rack.bays[bayValue].calibrationOffset);
    }
    java.lang.Boolean refreshScreen = testRun.bayItems[bayValue].updateValue(updatedValue, testRun.currentTestStep, context);
    aa.notifyDataSetChanged();
    if (refreshScreen) {
        updateCounts();
    }
}