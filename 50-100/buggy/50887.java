@android.annotation.SuppressLint(value = "InflateParams")
@java.lang.Override
public android.app.Dialog onCreateDialog(android.os.Bundle savedInstanceState) {
    android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(getOwner()).setIcon(R.drawable.ic_transfer_black_36dp).setTitle(R.string.chooseReceiverType).setNegativeButton(android.R.string.cancel, null);
    android.app.AlertDialog dialog = builder.create();
    int lrSpacingPx = getDialogLeftRightPaddingPx();
    setDialogView(dialog, lrSpacingPx, 0, lrSpacingPx, 0);
    return dialog;
}