@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.action_close)) {
        java.lang.System.exit(0);
        return true;
    }
    if (id == (R.id.action_options)) {
        android.content.Intent intent = new android.content.Intent(this, org.theiner.kinoxscanner.activities.OptionsActivity.class);
        startActivity(intent);
        return true;
    }
    return super.onOptionsItemSelected(item);
}