public static void alertDialog(android.app.Activity activity, java.lang.String title, java.lang.String msg) {
    android.support.v7.app.AlertDialog.Builder alertDialogBuilder = new android.support.v7.app.AlertDialog.Builder(activity);
    alertDialogBuilder.setTitle(title);
    alertDialogBuilder.setMessage(msg).setCancelable(false).setPositiveButton("Ok", new android.content.DialogInterface.OnClickListener() {
        public void onClick(android.content.DialogInterface dialog, int id) {
            dialog.dismiss();
        }
    });
    android.support.v7.app.AlertDialog alertDialog = alertDialogBuilder.create();
    alertDialog.show();
}