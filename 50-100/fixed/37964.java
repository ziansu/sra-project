@java.lang.Override
protected void onPostExecute(java.lang.Void result) {
    super.onPostExecute(result);
    if ((code) != 0) {
        mainActivity.getActivityHelper().closeLoadingBar();
        uploadPrescription(mainActivity, databaseHelper, code);
        android.util.Log.d("drugcorner", ("Verification code found from fragment interface " + (code)));
    }else {
        mainActivity.getActivityHelper().closeLoadingBar();
        retryButton.setVisibility(View.VISIBLE);
        textView.setText("Tap to Retry");
    }
}