@java.lang.Override
public void failure(retrofit.RetrofitError arg0) {
    android.util.Log.e("cox", ("ERROR!!! # message = " + (arg0.getMessage())));
    dialog.dismiss();
    android.app.AlertDialog.Builder alertbox = new android.app.AlertDialog.Builder(activity);
    alertbox.setTitle("Login");
    alertbox.setMessage("Login Gagal!");
    alertbox.setPositiveButton(android.R.string.ok, new android.content.DialogInterface.OnClickListener() {
        public void onClick(android.content.DialogInterface dialog, int which) {
            dialog.dismiss();
        }
    });
    alertbox.show();
}