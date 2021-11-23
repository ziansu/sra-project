public void storeLocalKgkBlock() {
    android.content.SharedPreferences.Editor savedDomainsEditor = this.savedDomains.edit();
    byte[] encryptedKgkBlock = this.getEncryptedKgk();
    savedDomainsEditor.putString("KGK", android.util.Base64.encodeToString(encryptedKgkBlock, Base64.DEFAULT));
    savedDomainsEditor.apply();
    this.storeSalt(this.salt);
}