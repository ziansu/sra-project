@java.lang.Override
public boolean onMenuItemClick(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.menu_check_all_unencrypted :
            checkkAllService(true);
            break;
        case R.id.menu_export :
            export();
            break;
        case R.id.menu_import :
            importFrom();
            break;
        case R.id.menu_edit :
            openSetting();
            break;
        case R.id.menu_change_theme :
            openChangeThemeDialog();
            break;
        case R.id.menu_exit :
            exit();
            break;
    }
    return false;
}