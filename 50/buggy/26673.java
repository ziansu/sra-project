@java.lang.Override
public void onDestroy() {
    com.example.mypc.relaxsound.util.PlayerConstants.TIME = 0;
    stopMusic();
    com.example.mypc.relaxsound.util.PlayerConstants.SONGS_LIST = com.example.mypc.relaxsound.util.UtilFunctions.listOfSongs(getApplicationContext());
    com.example.mypc.relaxsound.util.PlayerConstants.SONG_PAUSED = false;
    com.example.mypc.relaxsound.RelaxActivity.changeUI();
    super.onDestroy();
}