@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    android.util.Log.i(com.batsw.anonimitychat.mainScreen.MainScreenActivity.LOG, ("onOptionsItemSelected -> ENTER item=" + item));
    int id = item.getItemId();
    switch (id) {
        case R.id.action_network :
            android.util.Log.i(com.batsw.anonimitychat.mainScreen.MainScreenActivity.LOG, "action_network");
            mNetworkPopupActivity.show();
            break;
        default :
            android.util.Log.i(com.batsw.anonimitychat.mainScreen.MainScreenActivity.LOG, "default toolbar ... never here");
            break;
    }
    android.util.Log.i(com.batsw.anonimitychat.mainScreen.MainScreenActivity.LOG, "onOptionsItemSelected -> LEAVE");
    return true;
}