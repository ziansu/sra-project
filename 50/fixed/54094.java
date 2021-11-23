@java.lang.Override
public boolean dispatchKeyEvent(android.view.KeyEvent e) {
    return de.viktorreiser.bansheeremote.activity.CurrentSongActivity.handleKeyEvent(e) ? true : super.dispatchKeyEvent(e);
}