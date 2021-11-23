void close() throws java.io.IOException {
    int outputMp3buf = mAndroidLame.flush(mp3buffer);
    if (outputMp3buf > 0) {
        android.util.Log.i("Rewind", "Flushed MP3");
        os.write(mp3buffer, 0, outputMp3buf);
    }
    mAndroidLame.close();
    os.flush();
    os.close();
    android.util.Log.i("Rewind", ("Saved File at " + (file.toURI())));
}