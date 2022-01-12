@java.lang.Override
protected void onPostExecute(java.lang.String res) {
    if ((responseCode) == 200) {
        mProgressDialog.dismiss();
        java.lang.String destination_path = (android.os.Environment.getExternalStorageDirectory()) + "/HCircle";
        openFolder();
    }else {
        mProgressDialog.setMessage(res);
        mProgressDialog.setCancelable(true);
    }
}