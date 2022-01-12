@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    switch (item.getItemId()) {
        case R.id.action_logout :
            android.util.Log.d("MAIN_ACT", "Logout Selected");
            signUserOut();
            android.support.v4.app.NavUtils.navigateUpFromSameTask(this);
            return true;
        case android.R.id.home :
            this.finish();
            android.support.v4.app.NavUtils.navigateUpFromSameTask(this);
            return true;
        default :
            break;
    }
    return super.onOptionsItemSelected(item);
}