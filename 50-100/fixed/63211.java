private void playAudio(java.lang.String audio) {
    if (m.isPlaying()) {
        m.stop();
    }
    try {
        m = new android.media.MediaPlayer();
        m.setDataSource(audio);
        m.prepare();
        m.start();
        android.widget.Toast.makeText(getApplicationContext(), "Playing audio", Toast.LENGTH_LONG).show();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}