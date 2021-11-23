@java.lang.Override
public void action() {
    ve.ucv.ciens.cicore.icaro.ryabi.sensors.SensorEvent event = queue.getNextTouchSensorEvent();
    pilot.stop();
    pilot.travel((-100));
    ve.ucv.ciens.cicore.icaro.ryabi.utils.Rotations.rotate90(compass, pilot);
    pilot.travel(250);
    ve.ucv.ciens.cicore.icaro.ryabi.utils.Rotations.rotateM90(compass, pilot);
    pilot.stop();
    if (!(queue.hasNextTouchSensorEvent()))
        event.detector.enableDetection(true);
    
}