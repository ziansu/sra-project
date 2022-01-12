@java.lang.Override
@android.annotation.SuppressLint(value = "WorldReadableFiles")
@java.lang.SuppressWarnings(value = "deprecation")
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    getMenuInflater().inflate(R.menu.main, menu);
    com.dvd.android.xposed.enableambientdisplay.MainActivity.mServiceItem = menu.findItem(R.id.service);
    if (!(com.dvd.android.xposed.enableambientdisplay.MainActivity.isEnabled())) {
        menu.removeItem(R.id.hot_reboot);
        menu.removeItem(R.id.service);
    }else {
        android.content.SharedPreferences prefs = getSharedPreferences(com.dvd.android.xposed.enableambientdisplay.MainActivity.class.getSimpleName(), com.dvd.android.xposed.enableambientdisplay.MODE_WORLD_READABLE);
        com.dvd.android.xposed.enableambientdisplay.MainActivity.updateMenuItem(prefs.getBoolean(com.dvd.android.xposed.enableambientdisplay.utils.Utils.DOZE_PROXIMITY, false));
    }
    return true;
}