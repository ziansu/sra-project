@java.lang.Override
public void onSensorChanged(android.hardware.SensorEvent event) {
    nl.fontys.exercisecontrol.exercise.recorder.MeasurementAdaptor adaptor;
    if ((adaptor = adaptorMap.get(event.sensor)) == null)
        return ;
    
    if ((delay) < 0)
        delay = (event.timestamp) - (startTime);
    
    event.timestamp -= delay;
    try {
        adaptor.sensorEvent(event);
    } catch (nl.fontys.exercisecontrol.exercise.recorder.MeasurementException ex) {
        listenerThread.sendMessage(ex);
        adaptorMap.clear();
    }
}