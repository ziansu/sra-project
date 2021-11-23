@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    if ((android.content.DialogInterface.BUTTON_POSITIVE) == which) {
        isAlertDialogShown = false;
        clearModelManager();
        copyDefaultConfig();
        loadModelManager();
    }
}