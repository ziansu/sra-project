@java.lang.Override
public void onStop() {
    super.onStop();
    if (progressDialog.isShowing()) {
        progressDialog.dismiss();
        progressDialog.hide();
    }
}