@java.lang.Override
protected void onResume() {
    if ((br.com.carlosrafaelgn.fplay.ui.UI.forcedLocale) != (br.com.carlosrafaelgn.fplay.ui.UI.LOCALE_NONE))
        br.com.carlosrafaelgn.fplay.ui.UI.reapplyForcedLocale(getApplication(), this);
    
    br.com.carlosrafaelgn.fplay.playback.Player.setAppIdle(false);
    br.com.carlosrafaelgn.fplay.playback.Player.observer = this;
    reset = true;
    resumeTimer();
    onPlayerChanged(Player.currentSong, true, null);
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.ICE_CREAM_SANDWICH))
        prepareSystemUIObserver();
    
    super.onResume();
}