@java.lang.Override
public void onResume() {
    super.onResume();
    android.app.PendingIntent pi = android.app.PendingIntent.getActivity(this, 0, new android.content.Intent(this, getClass()).addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP), 0);
    if ((com.android.secure.messaging.Home.mNfcAdapter) != null)
        com.android.secure.messaging.Home.mNfcAdapter.enableForegroundDispatch(this, pi, null, null);
    
}