@java.lang.Override
public boolean onMenuItemClick(android.view.MenuItem item) {
    android.content.SharedPreferences.Editor ed = sharedPref.edit();
    ed.clear();
    ed.commit();
    android.content.Intent intent = new android.content.Intent(this, com.stalker.geiger.omen.geiger.services.mainStalkerService.class);
    stopService(intent);
    return false;
}