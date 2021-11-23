public void seekTo(int time) {
    if ((mp) != null) {
        if (pause) {
            mp.pause();
            mp.seekTo(time);
        }else {
            mp.pause();
            mp.seekTo(time);
            mp.start();
        }
    }
}