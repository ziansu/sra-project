@java.lang.Override
public boolean onKeyUp(int keyCode, @org.jetbrains.annotations.NotNull
android.view.KeyEvent event) {
    if (keyCode == (android.view.KeyEvent.KEYCODE_MENU)) {
        android.support.v7.widget.Toolbar toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
        if (toolbar.isOverflowMenuShowing()) {
            toolbar.dismissPopupMenus();
        }else {
            toolbar.showOverflowMenu();
        }
        return true;
    }
    return super.onKeyUp(keyCode, event);
}