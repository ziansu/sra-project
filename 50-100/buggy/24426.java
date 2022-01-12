protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (requestCode == (confirmationAnimationRC)) {
        android.util.Log.i(TAG, "onActivityResult");
        if (resultCode == (RESULT_OK)) {
            android.util.Log.i(TAG, "onActivityResult2");
            dismissNotification();
            this.finish();
        }
        if (resultCode == (RESULT_CANCELED)) {
            android.util.Log.i(TAG, "onActivityResult3");
            dismissNotification();
            this.finish();
        }
    }
}