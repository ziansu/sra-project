@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if ((item.getItemId()) == (R.id.action_sync)) {
        switch (com.mifos.utils.PrefManager.getUserStatus()) {
            case 0 :
                if ((groupPayloads.size()) != 0) {
                    mClientSyncIndex = 0;
                    syncGroupPayload();
                }else {
                    com.mifos.mifosxdroid.core.util.Toaster.show(rootView, "Nothing to Sync");
                }
                break;
            case 1 :
                showOfflineModeDialog();
                break;
            default :
                break;
        }
    }
    return super.onOptionsItemSelected(item);
}