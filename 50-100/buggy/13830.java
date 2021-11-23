@java.lang.Override
public boolean onMenuItemSelected(int featureId, android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (android.R.id.home)) {
        if (!(super.onMenuItemSelected(featureId, item))) {
            android.support.v4.app.NavUtils.navigateUpFromSameTask(this);
        }
        return true;
    }
    return super.onMenuItemSelected(featureId, item);
}