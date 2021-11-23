@java.lang.Override
public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
    if ((mController) == null) {
        return false;
    }
    return (mController.onKeyUp(keyCode, event)) || (super.onKeyUp(keyCode, event));
}