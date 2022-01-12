@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    switch (id) {
        case android.R.id.home :
            android.util.Log.d("hi", android.support.v4.app.NavUtils.getParentActivityName(this));
            android.support.v4.app.NavUtils.navigateUpFromSameTask(this);
            return true;
    }
    if (id == (R.id.action_settings)) {
        return true;
    }
    return super.onOptionsItemSelected(item);
}