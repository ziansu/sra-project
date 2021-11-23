@java.lang.Override
public void onTagDiscovered(android.nfc.Tag tag) {
    android.util.Log.i(com.chariotsolutions.nfc.plugin.NfcPlugin.TAG, ("onTagDiscovered " + tag));
    savedTag = tag;
    handleTag();
}