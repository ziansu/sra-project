@java.lang.Override
public void onStart() {
    super.onStart();
    progressDialog.setMessage("Loading dates from yahoo...");
    progressDialog.setCancelable(false);
    progressDialog.show();
}