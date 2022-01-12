@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.action_refresh)) {
        updateStat();
        return true;
    }
    if (id == (R.id.action_menu_settings)) {
        startActivity(new android.content.Intent(getActivity(), tom.chinesesuperleague.SettingsActivity.class));
        return true;
    }
    return super.onOptionsItemSelected(item);
}