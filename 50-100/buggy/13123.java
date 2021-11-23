public void dataReady(long recordTime, float rms, float spl, float[] bands) {
    listenerMutex.lock();
    for (ch.ethz.coss.nervousnet.sensors.NoiseSensor.NoiseSensorListener listener : listenerList) {
        listener.noiseSensorDataReady(new ch.ethz.coss.nervousnet.lib.NoiseReading(recordTime, rms));
    }
    listenerMutex.unlock();
}