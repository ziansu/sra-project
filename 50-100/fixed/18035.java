public void pauseRecording() {
    if ((currentAudioState.get()) == (com.github.republicofgavin.pauseresumeaudiorecorder.PauseResumeAudioRecorder.RECORDING_STATE)) {
        currentAudioState.getAndSet(com.github.republicofgavin.pauseresumeaudiorecorder.PauseResumeAudioRecorder.PAUSED_STATE);
        onTimeCompletedTimer.cancel();
        remainingMaxTimeInMillis = (remainingMaxTimeInMillis) - ((java.lang.System.currentTimeMillis()) - (recordingStartTimeMillis));
    }else {
        android.util.Log.w(com.github.republicofgavin.pauseresumeaudiorecorder.PauseResumeAudioRecorder.TAG, "Audio recording is not recording");
    }
}