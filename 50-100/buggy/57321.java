@java.lang.Override
public void setdataPos(int pos, boolean play) {
    if (pos != (-1)) {
        playingIndex = pos;
        CurrentSong = playList.get(playingIndex);
        if (play) {
            fastplay();
        }else {
            startCurrentTrack();
            paused = true;
        }
        if ((android.support.v4.content.PermissionChecker.checkSelfPermission(this, Manifest.permission.SYSTEM_ALERT_WINDOW)) == (android.support.v4.content.PermissionChecker.PERMISSION_GRANTED)) {
            widgetCover(CurrentSong);
        }
    }
}