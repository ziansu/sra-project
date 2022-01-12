private void showGameError() {
    new android.app.AlertDialog.Builder(this).setMessage(R.string.error_message).setNeutralButton(android.R.string.ok, this).create().show();
}