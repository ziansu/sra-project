@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.action_settings)) {
        android.content.Intent i = new android.content.Intent(ctx, ch.hevs.stockexchange.SettingsActivity.class);
        finish();
        startActivity(i);
        return true;
    }
    return super.onOptionsItemSelected(item);
}