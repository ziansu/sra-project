@java.lang.Override
protected void onPostExecute(java.lang.Void result) {
    updateData();
    super.onPostExecute(result);
    progressDialog.dismiss();
}