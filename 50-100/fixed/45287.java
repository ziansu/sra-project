@java.lang.Override
public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    if ((menuResId) != 0) {
        menu.findItem(R.id.menu_1).setIcon(menuResId);
    }
    if (!(android.text.TextUtils.isEmpty(menuStr))) {
        menu.findItem(R.id.menu_1).setTitle(menuStr);
    }
    return super.onPrepareOptionsMenu(menu);
}