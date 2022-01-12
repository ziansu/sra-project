@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_refresh :
            updateUI();
            return true;
    }
    return super.onOptionsItemSelected(item);
}