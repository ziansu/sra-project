public void run() {
    android.media.MediaPlayer mediaPlayer;
    android.net.Uri myUri = android.net.Uri.fromFile(audioFile);
    mediaPlayer = new android.media.MediaPlayer();
    mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
    try {
        mediaPlayer.setDataSource(context, myUri);
        mediaPlayer.prepare();
        callback.audioLoadSuccess(mediaPlayer);
    } catch (java.io.IOException e) {
        callback.audioLoadFail(e);
    }
}