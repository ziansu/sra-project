protected void onPause() {
    super.onPause();
    android.util.Log.i(com.example.simplenfc.MainActivity.TAG, "onPause()");
    if ((mNFCadapter) != null) {
        mNFCadapter.disableForegroundDispatch(this);
    }
}