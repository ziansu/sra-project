@java.lang.Override
public void showProgressDialog(com.techgrains.model.dialog.TGProgressDialog progressDialog) {
    dismissProgressDialog();
    if (progressDialog == null) {
        return ;
    }
    mProgressDialog = android.app.ProgressDialog.show(this.getApplicationContext(), progressDialog.getTitle(), progressDialog.getMessage(), progressDialog.isCancelable());
    if ((progressDialog.getIndeterminateDrawable()) != (-1)) {
        mProgressDialog.setIndeterminateDrawable(getResources().getDrawable(progressDialog.getIndeterminateDrawable()));
    }
}