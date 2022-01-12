@java.lang.Override
public void onSensorChanged(android.hardware.SensorEvent event) {
    nl.fontys.exercisecontrol.exercise.recorder.MeasurementAdaptor adaptor;
    if ((delay) < 0)
        delay = (event.timestamp) - (startTime);
    
    if ((adaptor = adaptorMap.get(event.sensor)) == null)
        return ;
    
    event.timestamp -= delay;
    try {
        adaptor.sensorEvent(event);
    } catch (nl.fontys.exercisecontrol.exercise.recorder.MeasurementException ex) {
        listenerThread.sendMessage(ex);
        adaptorMap.clear();
    }
}