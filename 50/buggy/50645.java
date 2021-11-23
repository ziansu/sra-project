@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if ((item.getItemId()) == (android.R.id.home))
        android.support.v4.app.NavUtils.navigateUpFromSameTask(this);
    
    return super.onOptionsItemSelected(item);
}