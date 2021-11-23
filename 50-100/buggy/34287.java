public void showAlertDialog(android.content.Context context, java.lang.String title, java.lang.String message, java.lang.Boolean status) {
    android.app.AlertDialog alertDialog = new android.app.AlertDialog.Builder(context).create();
    alertDialog.setTitle(title);
    alertDialog.setMessage(message);
    if (status != null)
        alertDialog.setIcon((status ? R.drawable.success : R.drawable.fail));
    
    alertDialog.setButton("OK", new android.content.DialogInterface.OnClickListener() {
        public void onClick(android.content.DialogInterface dialog, int which) {
        }
    });
    alertDialog.show();
}