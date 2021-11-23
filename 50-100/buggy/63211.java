private void playAudio(java.lang.String audio) {
    if (m.isPlaying()) {
        m.stop();
    }
    m = new android.media.MediaPlayer();
    try {
        m.setDataSource(outputFile);
        m.prepare();
        m.start();
        android.widget.Toast.makeText(getApplicationContext(), "Playing audio", Toast.LENGTH_LONG).show();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}