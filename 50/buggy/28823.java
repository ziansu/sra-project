@java.lang.Override
public void beforeRegistration() {
    isFailed = false;
    progressDialog = new android.app.ProgressDialog(context);
    progressDialog.setMessage("Registering ...");
    progressDialog.show();
}