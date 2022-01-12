private void prepareMediaPlayer() {
    time = 0;
    if ((myRecorder) == null) {
        java.io.File f = createFile(3);
        mAudioMediaUrl = f.getAbsolutePath();
        myRecorder = new android.media.MediaRecorder();
        myRecorder.setAudioSource(MediaRecorder.AudioSource.MIC);
        myRecorder.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
        myRecorder.setAudioEncoder(MediaRecorder.OutputFormat.AMR_NB);
        myRecorder.setOutputFile(f.getAbsolutePath());
    }
}