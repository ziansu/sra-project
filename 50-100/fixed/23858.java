public void previous() {
    currentPosition = 0;
    if (playerPlaying) {
        stop();
        playerPlaying = true;
    }
    if ((position) > 0) {
        android.util.Log.v(com.example.madisonn.musicplayer.PlayerService.LOG_TAG, "previous");
        (position)--;
    }
    prepare(titleIdList[position]);
}