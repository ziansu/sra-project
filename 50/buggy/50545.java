static void setRecordingBufferLengthMillis(int recordingBufferLengthMillis) {
    ee.ioc.phon.android.speechutils.ContinuousRawAudioRecorder.SessionStartPointer.mBeginningOfBufferPosition.setSessionStartPointerMillis(recordingBufferLengthMillis);
}