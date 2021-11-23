@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_complete :
            android.content.Intent intent = new android.content.Intent(getApplicationContext(), materialtest.theartistandtheengineer.co.materialtest.activities.RatingsActivity.class);
            intent.putExtra("RECIPIENT_ID", recipientId);
            intent.putExtra("RECIPIENT_USER_NAME", recipientUserName);
            startActivity(intent);
            break;
        case R.id.action_cancel :
            break;
        case R.id.action_log_out :
            break;
        case android.R.id.home :
            android.support.v4.app.NavUtils.navigateUpFromSameTask(this);
            break;
        case R.id.action_settings :
            return true;
    }
    return super.onOptionsItemSelected(item);
}