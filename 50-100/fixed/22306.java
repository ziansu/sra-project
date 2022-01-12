@java.lang.Override
protected void onResume() {
    br.com.carlosrafaelgn.fplay.playback.Player.setAppIdle(false);
    if ((br.com.carlosrafaelgn.fplay.ui.UI.forcedLocale) != (br.com.carlosrafaelgn.fplay.ui.UI.LOCALE_NONE))
        br.com.carlosrafaelgn.fplay.ui.UI.reapplyForcedLocale(getApplication(), this);
    
    if (((top) != null) && (top.paused)) {
        top.paused = false;
        top.onResume();
    }
    br.com.carlosrafaelgn.fplay.ui.SongAddingMonitor.start(this);
    super.onResume();
}