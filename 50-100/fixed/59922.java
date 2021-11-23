@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.action_settings)) {
        startActivity(new android.content.Intent(this, com.example.android.project1.app.SettingsActivity.class));
        return true;
    }
    return super.onOptionsItemSelected(item);
}