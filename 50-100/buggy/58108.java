void processIntent(android.content.Intent intent) {
    android.widget.Toast.makeText(this, "INTENT PROCESSED", Toast.LENGTH_LONG).show();
    android.os.Parcelable[] rawMsgs = intent.getParcelableArrayExtra(NfcAdapter.EXTRA_NDEF_MESSAGES);
    android.nfc.NdefMessage msg = ((android.nfc.NdefMessage) (rawMsgs[0]));
    java.lang.String TorchID = new java.lang.String(msg.getRecords()[0].getPayload());
    torchfrag.addTorch(TorchID);
}