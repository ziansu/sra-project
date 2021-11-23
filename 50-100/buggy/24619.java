public void loadMediaPlayer(android.media.MediaPlayer aPlayer, android.content.res.AssetFileDescriptor afdAudio) {
    try {
        aPlayer.setDataSource(afdAudio.getFileDescriptor(), afdAudio.getStartOffset(), afdAudio.getLength());
        aPlayer.prepare();
        aPlayer.start();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}