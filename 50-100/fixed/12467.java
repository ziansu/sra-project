@java.lang.Override
public void run() {
    while ((mRecorder.getRecordingState()) == (android.media.AudioRecord.RECORDSTATE_RECORDING)) {
        short[] data = new short[(mBufferSize) / 2];
        mRecorder.read(data, 0, ((mBufferSize) / 2));
        mDecoder.appendSignal(data);
    } 
}