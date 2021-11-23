@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    java.lang.String action = intent.getAction();
    if (action.equals(Intent.ACTION_CLOSE_SYSTEM_DIALOGS)) {
        java.lang.String reason = intent.getStringExtra(SYSTEM_DIALOG_REASON_KEY);
        if (android.text.TextUtils.isEmpty(reason)) {
            return ;
        }
        if (reason.equals(SYSTEM_DIALOG_REASON_HOME_KEY)) {
            if (mOnPreviewing) {
                CameraDrawer.INSTANCE.stopPreview();
            }
        }
    }
}