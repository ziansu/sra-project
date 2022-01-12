@java.lang.Override
public void onBackPressed() {
    new android.support.v7.app.AlertDialog.Builder(this).setMessage("Confirm Exit").setPositiveButton("Exit", new android.content.DialogInterface.OnClickListener() {
        public void onClick(android.content.DialogInterface dialog, int id) {
            finish();
        }
    }).setNegativeButton("Cancel", null).show();
}