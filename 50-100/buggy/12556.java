public void stopRecording() throws java.io.IOException {
    isRecording = false;
    mr.stop();
    mr.reset();
    mr.release();
    java.io.File recordedFile = new java.io.File(app.ddf.danskdatahistoriskforening.helper.LocalMediaStorage.getOutputMediaFileUri(null, LocalMediaStorage.MEDIA_TYPE_AUDIO_RECORD).getPath());
    java.io.File recordedFileTemp = new java.io.File(app.ddf.danskdatahistoriskforening.helper.LocalMediaStorage.getOutputMediaFileUri(null, LocalMediaStorage.MEDIA_TYPE_AUDIO_RECORD_TEMP).getPath());
    mergeAudioFile(recordedFile, recordedFileTemp);
}