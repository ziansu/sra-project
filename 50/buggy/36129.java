@java.lang.Override
public void onPause() {
    super.onPause();
    if (((de.htw_berlin.sharkandroidstack.modules.nfc.NfcBenchmarkFragment.nfcAdapter) != null) && ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.KITKAT))) {
        de.htw_berlin.sharkandroidstack.modules.nfc.NfcBenchmarkFragment.nfcAdapter.disableReaderMode(this);
    }
}