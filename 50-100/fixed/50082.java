@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_create_marker :
            createMarker();
            break;
        case R.id.action_end :
            stopService(playIntent);
            musicSrv = null;
            java.lang.System.exit(0);
            break;
    }
    return super.onOptionsItemSelected(item);
}