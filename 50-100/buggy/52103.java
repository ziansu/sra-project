@java.lang.Override
public boolean onOptionsItemSelected(com.application.material.takeacoffee.app.fragments.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_position :
            ((com.application.material.takeacoffee.app.fragments.interfaces.OnChangeFragmentWrapperInterface) (com.application.material.takeacoffee.app.fragments.CoffeePlacesFragment.mainActivityRef)).changeFragment(new com.application.material.takeacoffee.app.fragments.MapFragment(), null, MapFragment.MAP_FRAG_TAG);
            break;
        case R.id.action_settings :
            ((com.application.material.takeacoffee.app.fragments.interfaces.OnChangeFragmentWrapperInterface) (com.application.material.takeacoffee.app.fragments.CoffeePlacesFragment.mainActivityRef)).changeFragment(new com.application.material.takeacoffee.app.fragments.SettingListFragment(), null, SettingListFragment.SETTING_LIST_FRAG_TAG);
            break;
    }
    return true;
}