private void setCancelListener(android.support.v4.app.DialogFragment dialogFragment) {
    if (dialogFragment != null) {
        dialogFragment.setCancelable(cancellable);
        if (dialogFragment instanceof com.shaubert.ui.dialogs.CancellableDialogFragment) {
            ((com.shaubert.ui.dialogs.CancellableDialogFragment) (dialogFragment)).setCanceledOnTouchOutside(canceledOnTouchOutside);
            ((com.shaubert.ui.dialogs.CancellableDialogFragment) (dialogFragment)).setCancelListener(cancelListener);
        }
    }
}