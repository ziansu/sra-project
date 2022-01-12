public void seekTo(int time) {
    if (pause) {
        mp.pause();
        mp.seekTo(time);
    }else {
        mp.pause();
        mp.seekTo(time);
        mp.start();
    }
}