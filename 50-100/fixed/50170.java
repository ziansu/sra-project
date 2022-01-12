@android.support.annotation.NonNull
@java.lang.Override
public android.app.Dialog onCreateDialog(android.os.Bundle savedInstanceState) {
    android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(getContext());
    builder.setTitle(R.string.dialog_bluetooth_disabled_title).setMessage(R.string.dialog_bluetooth_disabled_msg).setPositiveButton(android.R.string.ok, new android.content.DialogInterface.OnClickListener() {
        @java.lang.Override
        public void onClick(android.content.DialogInterface dialog, int which) {
            getActivity().finish();
        }
    });
    return builder.create();
}