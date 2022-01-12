public void showAlertDialog(android.content.Context context) {
    android.app.AlertDialog.Builder am = new android.app.AlertDialog.Builder(context);
    am.setTitle(getString(R.string.gps_off_title));
    am.setMessage(getString(R.string.gps_off));
    am.show();
}