public void back() {
    back = true;
    if (startOver) {
        startOver = false;
    }else
        if ((nowPlayingPosition) > 0) {
            nowPlayingPosition = (nowPlayingPosition) - 1;
            handler.removeCallbacks(r);
        }
    
    handler.postDelayed(r, 250);
    stop();
    nowPlaying = queue.get(nowPlayingPosition);
    loadSong(nowPlaying);
}