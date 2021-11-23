public void stopRecording() {
    mIsRecorkding = false;
    synchronized(mAudioRecordLock) {
        mAudioRecord.stop();
        mAudioRecord.release();
        mAudioRecord = null;
    }
}