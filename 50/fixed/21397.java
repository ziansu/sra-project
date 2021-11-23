@java.lang.Override
public void onDismiss(android.content.DialogInterface dialog) {
    super.onDismiss(dialog);
    if (mFinishActivity) {
        java.lang.System.exit(0);
    }
}