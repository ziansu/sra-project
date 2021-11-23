@java.lang.Override
public void onDismiss(android.content.DialogInterface dialog) {
    if ((callback) != null) {
        callback.onDismiss();
    }
}