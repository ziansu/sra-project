public void play(android.database.Cursor cursor) {
    if (isPaused()) {
        start();
        paused = false;
    }else {
        playPrepared(cursor);
        start();
    }
}