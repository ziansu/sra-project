@java.lang.Override
protected void onPostExecute(java.lang.Void result) {
    super.onPostExecute(result);
    updateData();
    updateData();
    updateAdapter();
    progressDialog.dismiss();
}