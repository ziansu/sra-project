@java.lang.Override
public void onClick(android.view.View v) {
    alertDialog.setTitle("Cancel?");
    alertDialog.setPositiveButton("Yes", new android.content.DialogInterface.OnClickListener() {
        @java.lang.Override
        public void onClick(android.content.DialogInterface dialog, int which) {
            startActivity(new android.content.Intent(btracker.example.raggitha.btracker.editProfileActivity.this, btracker.example.raggitha.btracker.profileActivity.class));
            finish();
        }
    });
    alertDialog.setNegativeButton("No", null);
    alertDialog.setCancelable(true);
    android.support.v7.app.AlertDialog dialog;
    dialog = alertDialog.create();
    dialog.show();
}