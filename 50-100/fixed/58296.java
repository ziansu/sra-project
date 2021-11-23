public void storeSalt(byte[] salt) {
    this.salt = salt;
    android.content.SharedPreferences.Editor savedDomainsEditor = this.savedDomains.edit();
    savedDomainsEditor.putString("salt", android.util.Base64.encodeToString(salt, Base64.DEFAULT));
    savedDomainsEditor.apply();
}