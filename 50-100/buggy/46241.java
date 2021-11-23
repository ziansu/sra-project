@java.lang.Override
public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
    if (keyCode == (android.view.KeyEvent.KEYCODE_BACK)) {
        if ((currentPath.indexOf(TPStrings.SLASH, 2)) != (-1)) {
            getDir(parentPath);
        }else {
            return super.onKeyDown(keyCode, event);
        }
        return true;
    }else {
        return super.onKeyDown(keyCode, event);
    }
}