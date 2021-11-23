public void previous() {
    if ((position) > 0) {
        android.util.Log.v(com.example.madisonn.musicplayer.PlayerService.LOG_TAG, "previous");
        (position)--;
        currentPosition = 0;
    }
    if (playerPlaying) {
        stop();
        playerPlaying = true;
    }
    prepare(titleIdList[position]);
}