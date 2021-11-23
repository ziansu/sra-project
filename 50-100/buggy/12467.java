@java.lang.Override
public void run() {
    android.util.Log.d("WaterLevel", "in mRecordFeed");
    while ((mRecorder.getRecordingState()) == (android.media.AudioRecord.RECORDSTATE_RECORDING)) {
        short[] data = new short[(mBufferSize) / 2];
        mRecorder.read(data, 0, ((mBufferSize) / 2));
        android.util.Log.d("WaterLevel", "in mRecordFeed, in while, before appendSignal");
        mDecoder.appendSignal(data);
        android.util.Log.d("WaterLevel", "in mRecordFeed, in while, after appendSignal");
    } 
}