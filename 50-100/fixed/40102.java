@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.action_exit)) {
        java.lang.Process.killProcess(java.lang.Process.myPid());
        return true;
    }else
        if (id == (R.id.action_watched)) {
            android.content.Intent i = new android.content.Intent(getApplicationContext(), in.livedev.watchnow.WatchedActivity.class);
            startActivity(i);
        }
    
    return super.onOptionsItemSelected(item);
}