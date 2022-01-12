private void prepareAudio(java.lang.String audioFileName, android.media.MediaPlayer mp) {
    try {
        mp.reset();
        android.content.res.AssetFileDescriptor afd;
        afd = getAssets().openFd(audioFileName);
        mp.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
        mp.prepareAsync();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}