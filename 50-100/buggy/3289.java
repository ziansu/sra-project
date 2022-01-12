@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (no.hioa.recruiting.activities.BaitActivity.D)
        android.util.Log.d(no.hioa.recruiting.activities.BaitActivity.TAG, "--- onOptionsItemSelected ---");
    
    switch (item.getItemId()) {
        case R.id.bait_option_about :
            startActivity(new android.content.Intent(getApplicationContext(), no.hioa.recruiting.activities.AboutActivity.class));
            break;
        case R.id.bait_option_connect :
            android.content.Intent i = new android.content.Intent(this, no.hioa.recruiting.activities.ConnectionActivity.class);
            startActivityForResult(i, no.hioa.recruiting.activities.BaitActivity.CONNECTED_RESULT);
            break;
    }
    return super.onOptionsItemSelected(item);
}