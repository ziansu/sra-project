@java.lang.Override
public boolean onMenuItemClick(android.view.MenuItem item) {
    boolean display_unread_only = !(item.isChecked());
    if (loadContent(display_unread_only)) {
        item.setChecked(display_unread_only);
    }
    return false;
}