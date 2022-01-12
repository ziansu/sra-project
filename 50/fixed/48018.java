@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_find_master :
            android.util.Log.d("BasicActivity", "find master");
            break;
        case R.id.action_free_area :
            android.util.Log.d("BasicActivity", "free area");
            break;
    }
    return false;
}