public void updateNFCData() {
    if ((mNfcFingerprints) != null) {
        mNfcFingerprint = org.sufficientlysecure.keychain.ui.util.KeyFormattingUtils.convertFingerprintToHex(mNfcFingerprints);
        byte[] fp = new byte[20];
        java.nio.ByteBuffer.wrap(fp).put(mNfcFingerprints, 0, 20);
        mNfcFingerprint = org.sufficientlysecure.keychain.ui.util.KeyFormattingUtils.convertFingerprintToHex(fp);
    }
}