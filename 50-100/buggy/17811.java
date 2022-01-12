@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.action_settings)) {
        return true;
    }
    if (id == (R.id.action_signout)) {
        com.rohanharrison.notes.SaveSharedPreference.clearUserName(this);
        android.content.Intent intent = new android.content.Intent(this, com.rohanharrison.notes.LoginActivity.class);
        startActivity(intent);
    }
    return super.onOptionsItemSelected(item);
}