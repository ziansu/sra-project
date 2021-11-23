@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    super.onPostExecute(result);
    if ((d) == 1) {
        bscan.setEnabled(true);
        btransfer.setEnabled(true);
        bsubmit.setEnabled(false);
    }
    if ((flag) == 1) {
        android.widget.Toast.makeText(getBaseContext(), "PurchaseID not correct !!!", Toast.LENGTH_SHORT).show();
    }
}