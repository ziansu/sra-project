@java.lang.Override
public void writeDigitalSamples(int[] samples, int offset, int length) {
    sampleCounter += samples.length;
    for (com.biorecorder.bdfrecorder.BdfDataListener listener : dataListeners) {
        listener.onDataRecordReceived(samples);
    }
    if ((edfFileWriter) != null) {
        edfFileWriter.writeDigitalSamples(samples, offset, length);
    }
}