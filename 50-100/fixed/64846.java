@org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
public void onMessageEvent(com.owncloud.android.ui.events.MenuItemClickEvent event) {
    unsetAllDrawerMenuItems();
    switch (event.menuItem.getItemId()) {
        case R.id.nav_bar_files :
            showFiles(false);
            break;
        case R.id.nav_bar_settings :
            android.content.Intent settingsIntent = new android.content.Intent(getApplicationContext(), com.owncloud.android.ui.activity.Preferences.class);
            startActivity(settingsIntent);
            break;
        default :
            break;
    }
}