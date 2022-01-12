@java.lang.Override
public void onStart() {
    super.onStart();
    org.mozilla.gecko.GeckoApp.getEventDispatcher().registerGeckoThreadListener(this, "MediaPlayer:Load", "MediaPlayer:Start", "MediaPlayer:Stop", "MediaPlayer:Play", "MediaPlayer:Pause", "MediaPlayer:End", "MediaPlayer:Mirror", "MediaPlayer:Message", "AndroidCastDevice:Start", "AndroidCastDevice:Stop", "AndroidCastDevice:SyncDevice");
}