@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case android.R.id.home :
            finish();
            java.lang.System.exit(0);
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}