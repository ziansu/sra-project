public static int getAudioSampleRate() {
    for (int i = 0; i < (de.uni_freiburg.es.sensorrecordingtool.sensors.AudioSensor.validSampleRates.length); i++) {
        int result = android.media.AudioRecord.getMinBufferSize(de.uni_freiburg.es.sensorrecordingtool.sensors.AudioSensor.validSampleRates[i], de.uni_freiburg.es.sensorrecordingtool.sensors.AudioSensor.mChannelConfig, de.uni_freiburg.es.sensorrecordingtool.sensors.AudioSensor.mAudioFormat);
        if (result > 0) {
            return de.uni_freiburg.es.sensorrecordingtool.sensors.AudioSensor.validSampleRates[i];
        }
    }
    return -1;
}