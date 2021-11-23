private void analyzeAndNotify(short[] mAudioBuffer) {
    int sum = 0;
    for (int j = 0; j < (mAudioBuffer.length); j++) {
        sum += java.lang.Math.abs(mAudioBuffer[j]);
    }
    sum = sum / (mAudioBuffer.length);
    int mId = 0;
    if (sum > 2000.0F) {
        notify("Too loud!");
    }
}