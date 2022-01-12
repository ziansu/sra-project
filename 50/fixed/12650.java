@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.select_picture :
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}