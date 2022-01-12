public int getMessageDigestBufferSize() {
    int messageDigestBufferSize = this.preferences.getMessageDigestBufferSize();
    if (messageDigestBufferSize < (com.googlecode.cchlib.apps.duplicatefiles.prefs.PreferencesControler.MIN_MESSAGE_DIGEST_BUFFER_SIZE)) {
        messageDigestBufferSize = com.googlecode.cchlib.apps.duplicatefiles.prefs.PreferencesControler.DEFAULT_MESSAGEDIGEST_BUFFER_SIZE;
        this.preferences.setMessageDigestBufferSize(messageDigestBufferSize);
    }
    return messageDigestBufferSize;
}