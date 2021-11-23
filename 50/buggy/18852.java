protected void onPostExecute(java.lang.Boolean t) {
    android.util.Log.d("gh", "hgh");
    pdia.dismiss();
    sendBarcodeToActivity(codeContent, false);
}