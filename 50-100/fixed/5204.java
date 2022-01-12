@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    try {
        if (which == (android.app.AlertDialog.BUTTON_POSITIVE)) {
            setResult(com.android.systemui.media.RESULT_OK, getMediaProjectionIntent(mUid, mPackageName, mPermanentGrant));
        }
    } catch (android.os.RemoteException e) {
        android.util.Log.e(com.android.systemui.media.MediaProjectionPermissionActivity.TAG, "Error granting projection permission", e);
        setResult(com.android.systemui.media.RESULT_CANCELED);
    } finally {
        if ((mDialog) != null) {
            mDialog.dismiss();
        }
        finish();
    }
}