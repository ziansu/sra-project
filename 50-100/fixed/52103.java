@java.lang.Override
public boolean onOptionsItemSelected(com.application.material.takeacoffee.app.fragments.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_position :
            changeFragment(new com.application.material.takeacoffee.app.fragments.MapFragment(), MapFragment.MAP_FRAG_TAG);
            break;
        case R.id.action_settings :
            changeFragment(new com.application.material.takeacoffee.app.fragments.SettingListFragment(), SettingListFragment.SETTING_LIST_FRAG_TAG);
            break;
    }
    return true;
}