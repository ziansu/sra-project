public static void close() {
    if (com.password.manager.gui.helper.AlertDialogHelper.alertDialogHelper.dialog.isShowing()) {
        com.password.manager.gui.helper.AlertDialogHelper.alertDialogHelper.dialog.dismiss();
    }
}