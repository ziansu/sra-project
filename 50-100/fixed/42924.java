@java.lang.Override
public boolean onMenuItemClick(android.view.MenuItem item) {
    final java.lang.String title = item.getTitle().toString();
    if ("delete".equals(title)) {
        deleteAddInfo(item.getItemId());
    }else {
        return false;
    }
    return true;
}