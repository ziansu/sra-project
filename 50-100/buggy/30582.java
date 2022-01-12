public void storeLocalKgkBlock() {
    android.content.SharedPreferences.Editor savedDomainsEditor = this.savedDomains.edit();
    byte[] encryptedKgkBlock = this.getEncryptedKgk();
    android.util.Log.d("enc kgk saved", de.pinyto.ctSESAM.Hextools.bytesToHex(encryptedKgkBlock));
    savedDomainsEditor.putString("KGK", android.util.Base64.encodeToString(encryptedKgkBlock, Base64.DEFAULT));
    savedDomainsEditor.apply();
    this.storeSalt(this.salt);
}