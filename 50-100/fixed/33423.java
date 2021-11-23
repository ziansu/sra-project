private void showAbout() {
    try {
        new android.app.AlertDialog.Builder(this).setTitle(R.string.about).setMessage(R.string.copyright).setPositiveButton("OK", new android.content.DialogInterface.OnClickListener() {
            public void onClick(android.content.DialogInterface dialog, int which) {
            }
        }).create().show();
    } catch (java.lang.Exception e) {
    }
}