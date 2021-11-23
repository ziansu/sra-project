@java.lang.Override
public android.app.Dialog onCreateDialog(final android.os.Bundle savedInstanceState) {
    final android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(getActivity());
    builder.setView(initView());
    builder.setTitle(R.string.uvc_device_select);
    builder.setPositiveButton(android.R.string.ok, mOnDialogClickListener);
    builder.setNegativeButton(android.R.string.cancel, mOnDialogClickListener);
    builder.setNeutralButton(R.string.uvc_device_refresh, mOnDialogClickListener);
    final android.app.Dialog dialog = builder.create();
    dialog.setCancelable(true);
    dialog.setCanceledOnTouchOutside(true);
    return dialog;
}