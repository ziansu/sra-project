@java.lang.Override
protected void onPostExecute(java.lang.Void result) {
    super.onPostExecute(result);
    if ((code) != 0) {
        uploadPrescription(mainActivity, databaseHelper, code);
        mainActivity.getActivityHelper().closeLoadingBar();
        android.util.Log.d("drugcorner", ("Verification code found from fragment interface " + (code)));
    }else {
        retryButton.setVisibility(View.VISIBLE);
        textView.setText("Tap to Retry");
    }
}