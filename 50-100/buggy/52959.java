@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.action_settings)) {
        return true;
    }
    if (id == (R.id.action_search)) {
        android.content.Intent i = new android.content.Intent(getApplicationContext(), com.example.vuun.description.SearchActivity.class);
        startActivity(i);
        return true;
    }
    return super.onOptionsItemSelected(item);
}