@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.action_settings)) {
        android.content.Intent intent = new android.content.Intent(this, com.example.android.sunshine.app.SettingsActivity.class);
        startActivity(intent);
        return true;
    }else
        if (id == (R.id.action_map)) {
            showMap();
            return true;
        }
    
    return super.onOptionsItemSelected(item);
}