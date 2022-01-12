@java.lang.Override
public void onServiceConnected(android.content.ComponentName name, android.os.IBinder binder) {
    mService = ((com.android.contacts.common.vcard.VCardService.MyBinder) (binder)).getService();
    mBind = true;
    if ((mVCardCacheThread) != null) {
        android.util.Log.i(com.android.contacts.common.vcard.ImportVCardActivity.LOG_TAG, java.lang.String.format("Connected to VCardService. Kick a vCard cache thread (uri: %s)", java.util.Arrays.toString(mVCardCacheThread.getSourceUris())));
        mVCardCacheThread.start();
    }
}