@java.lang.Override
public void action() {
    ve.ucv.ciens.cicore.icaro.ryabi.sensors.SensorEvent event = queue.getNextTouchSensorEvent();
    event.detector.enableDetection(false);
    pilot.stop();
    pilot.travel((-100));
    ve.ucv.ciens.cicore.icaro.ryabi.utils.Rotations.rotate90(compass, pilot);
    pilot.travel(250);
    ve.ucv.ciens.cicore.icaro.ryabi.utils.Rotations.rotateM90(compass, pilot);
    pilot.stop();
    while (queue.hasNextTouchSensorEvent())
        event = queue.getNextTouchSensorEvent();
    
    event.detector.enableDetection(true);
}