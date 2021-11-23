@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (org.hisp.dhis.android.sdk.R.id.action_settings)) {
        mNavigationHandler.switchFragment(new org.hisp.dhis.android.eventcapture.fragments.settings.SettingsFragment(), SettingsFragment.TAG, true);
        return true;
    }else
        if (id == (org.hisp.dhis.android.sdk.R.id.action_about)) {
            mNavigationHandler.switchFragment(new org.hisp.dhis.android.eventcapture.fragments.AboutUsFragment(), AboutUsFragment.TAG, true);
            return true;
        }
    
    return super.onOptionsItemSelected(item);
}