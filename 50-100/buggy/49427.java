@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    if ((id) == (Constants.notId))
        return true;
    
    getMenuInflater().inflate(R.menu.menu_webviewer, menu);
    menu.findItem(R.id.action_id).setTitle(("Id: " + ((id) != (Constants.notId) ? id : "not found")));
    menu.findItem(R.id.action_reset).setEnabled(BuildConfig.DEBUG);
    return true;
}