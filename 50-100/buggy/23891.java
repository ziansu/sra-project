public void onPrepared(android.media.MediaPlayer mp) {
    com.mosync.internal.android.MoSyncAudio.AudioData audioData = mAudioData.get(mPreparingAudioData);
    audioData.setPreparedState(com.mosync.internal.android.MoSyncAudio.AUDIO_PREPARED);
    int[] event = new int[2];
    event[0] = com.mosync.internal.generated.MAAPI_consts.EVENT_TYPE_AUDIO_PREPARED;
    event[1] = mPreparingAudioData;
    mMoSyncThread.postEvent(event);
    mPreparingAudioData = 0;
}