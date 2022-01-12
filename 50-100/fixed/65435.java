@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.action_settings)) {
        android.content.Intent myIntent = new android.content.Intent(this, org.fslhome.videl.curiosityapplication.SettingsActivity.class);
        startActivity(myIntent);
        return true;
    }
    return super.onOptionsItemSelected(item);
}