@java.lang.Override
public void onLinkDisconnected() {
    if ((compListener) != null)
        compListener.onDisconnected();
    
    if (!(org.droidplanner.services.android.BuildConfig.SITL_DEBUG)) {
        controllerLinkManager.stop();
    }
    soloLinkMgr.stop();
}