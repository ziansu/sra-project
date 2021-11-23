private void showAbout() {
    try {
        new android.app.AlertDialog.Builder(this).setTitle(R.string.about).setMessage(R.string.copyright).setPositiveButton("OK", new android.content.DialogInterface.OnClickListener() {
            public void onClick(android.content.DialogInterface dialog, int which) {
            }
        }).create().show();
    } catch (java.lang.Exception e) {
        android.widget.Toast.makeText(getApplicationContext(), ((getString(R.string.exception)) + (e.getLocalizedMessage())), Toast.LENGTH_SHORT).show();
    }
}