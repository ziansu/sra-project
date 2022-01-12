private boolean checkCurrentPassphraseValid(java.lang.String address, java.lang.String passphrase, java.lang.String appPassphrase) {
    org.thanthoai.securesms.model.PassphraseModel model = org.thanthoai.securesms.model.PassphraseModel.findByAddress(this, address);
    if (model != null) {
        final java.lang.String plainPassphrase = org.thanthoai.securesms.crypto.AESHelper.decryptFromBase64(appPassphrase, model.Passphrase.replace(Global.MESSAGE_PREFIX, ""));
        return (plainPassphrase != null) && (plainPassphrase.equals(passphrase));
    }
    return true;
}