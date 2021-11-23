@java.lang.Override
public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
    return event.isAltPressed() ? false : super.onKeyDown(keyCode, event);
}