public void onPause() {
    if (!((mMyMediaplayer) == null)) {
        currentPos = mMyMediaplayer.getCurrentPosition();
        mMyMediaplayer.pause();
    }else {
    }
}