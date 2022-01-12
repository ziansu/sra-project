@java.lang.SuppressWarnings(value = "unchecked")
private de.ovgu.softwareprojektapp.sensors.AbstractSensor getSensor(de.ovgu.softwareprojekt.SensorType sensorType) throws java.io.IOException, java.lang.ClassNotFoundException, java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
    if (!(mSensors.containsKey(sensorType))) {
        java.lang.reflect.Constructor<?> constructor = getClass(sensorType).getConstructor(android.content.Context.class);
        de.ovgu.softwareprojektapp.sensors.AbstractSensor instance = ((de.ovgu.softwareprojektapp.sensors.AbstractSensor) (constructor.newInstance(mContext)));
        instance.setRunning(true);
        instance.setDataSink(mDataSink);
        mSensors.put(sensorType, instance);
    }
    return mSensors.get(sensorType);
}