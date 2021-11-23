@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.action_search_filter)) {
        android.widget.Toast.makeText(getApplicationContext(), "Filter clicked", Toast.LENGTH_SHORT).show();
        launchFilterDialog();
        return true;
    }
    return super.onOptionsItemSelected(item);
}