public void onClick(android.content.DialogInterface dialog, int which) {
    dialog.dismiss();
    startActivity(new android.content.Intent(this, hyjjr.cs160.com.safe_radius.MainActivity.class));
    this.finish();
}