@java.lang.Override
public boolean onLongClick(android.view.View v) {
    java.lang.String parseID = com.google.firebase.iid.FirebaseInstanceId.getInstance().getToken();
    android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(v.getContext());
    builder.setMessage(parseID).setTitle(R.string.parse_id_dialog_title);
    builder.setPositiveButton(R.string.parse_id_dialog_ok_button, new android.content.DialogInterface.OnClickListener() {
        public void onClick(android.content.DialogInterface dialog, int id) {
        }
    });
    android.app.AlertDialog dialog = builder.create();
    dialog.show();
    return true;
}