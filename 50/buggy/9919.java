@java.lang.Override
public void onDestroy() {
    audioManager.unregisterMediaButtonEventReceiver(new android.content.ComponentName(this, com.github.guwenk.smuradio.PlayerService.RemoteControlReceiver.class));
    updateUI(null);
    super.onDestroy();
}