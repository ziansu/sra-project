protected void onPause() {
    super.onPause();
    android.util.Log.i(com.example.simplenfc.MainActivity.TAG, "onPause()");
    mNFCadapter.disableForegroundDispatch(this);
}