@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.miSearch :
            onSearch();
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}