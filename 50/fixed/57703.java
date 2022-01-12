@java.lang.Override
public void stopBeat() {
    if ((svc) != null) {
        com.tungnd.android.metronome.MainActivity.playerService.stopBeat();
        beatView.stopBeat();
        stopService(svc);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);
    }
}