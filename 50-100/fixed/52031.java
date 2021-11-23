@java.lang.Override
public void showError(java.lang.String message) {
    android.util.Log.e("error", (" in get attraction list" + message));
    if ((progressDialog) != null) {
        progressDialog.dismiss();
    }
    if ((message.contains("Unable to resolve host ")) || (message.contains("Software caused connection abort"))) {
        android.widget.Toast.makeText(getApplicationContext(), "عدم دسترسی به اینترنت", Toast.LENGTH_LONG).show();
    }
}