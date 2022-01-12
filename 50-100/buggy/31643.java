private void showToast(int errorCount) {
    java.lang.String message = getString(R.string.toast_success_message);
    if (errorCount > 0) {
        message = getString(R.string.toast_error_message, errorCount);
    }
    android.widget.Toast toast = android.widget.Toast.makeText(this, message, Toast.LENGTH_SHORT);
    toast.show();
}