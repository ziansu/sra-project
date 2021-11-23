@java.lang.Override
public com.getwandup.rxsensor.domain.RxSensorEvent call(com.getwandup.rxsensor.domain.RxSensorEvent sensorEvent) {
    sensorValue = lowPass(sensorEvent.values.clone(), sensorValue);
    sensorEvent.values = sensorValue.clone();
    return sensorEvent;
}