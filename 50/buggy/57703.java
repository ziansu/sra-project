@java.lang.Override
public void stopBeat() {
    if ((svc) != null) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);
        com.tungnd.android.metronome.MainActivity.playerService.stopBeat();
        beatView.stopBeat();
        stopService(svc);
    }
}