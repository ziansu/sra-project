@java.lang.Override
protected void onPostExecute(java.lang.Boolean success) {
    super.onPostExecute(success);
    if (mProgressDialog.isShowing()) {
        mProgressDialog.dismiss();
    }else {
    }
    if (success) {
        gotoMainActivity();
    }else {
        android.widget.Toast.makeText(this, "Error\nPlease start app again!", Toast.LENGTH_SHORT).show();
    }
}