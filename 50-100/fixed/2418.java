public static void showOptionsDialog(android.content.Context context, java.lang.String title, java.lang.CharSequence[] options, boolean cancelable, android.content.DialogInterface.OnClickListener listener) {
    android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(context);
    if (title != null)
        builder.setTitle(title);
    
    builder.setItems(options, listener);
    builder.setNegativeButton("Cancel", new android.content.DialogInterface.OnClickListener() {
        @java.lang.Override
        public void onClick(android.content.DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    });
    builder.setCancelable(cancelable);
    builder.show();
}