@java.lang.Override
public boolean onOptionsItemSelected(android.support.v4.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.ab_refresh :
            this.refresh();
            return true;
        case R.id.ab_search :
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}