private void toggleProgressBar(boolean isShow) {
    if (isShow) {
        progressDialog.show();
    }else {
        if ((progressDialog) != null) {
            progressDialog.dismiss();
        }
    }
}