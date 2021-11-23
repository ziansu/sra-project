@java.lang.Override
public void loop() {
    hu.oe.nik.szfmv17t.automatedcar.bus.VirtualFunctionBus.sendSignal(new hu.oe.nik.szfmv17t.automatedcar.bus.Signal(hu.oe.nik.szfmv17t.automatedcar.powertrainsystem.PowertrainSystem.CAMERA_SENSOR_ID, null));
    fieldView = cameraSensor.getSensorFieldView(car);
    seenWorldObjects = world.checkSensorArea(fieldView);
    relevantObjects = cameraSensor.getRelevantWorldObjects(seenWorldObjects);
    cameraSensorStoredData = getDataOfCameraSensor(car, relevantObjects);
    printOutInformation();
}