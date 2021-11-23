@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (android.R.id.home)) {
        android.content.Intent intent = new android.content.Intent(this, com.evernews.evernews.Main.class);
        startActivity(intent);
        finish();
        return true;
    }
    if (id == (R.id.action_settings)) {
        return true;
    }
    return super.onOptionsItemSelected(item);
}