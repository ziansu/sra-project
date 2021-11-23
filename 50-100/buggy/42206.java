private byte[] getEncryptionKey() {
    byte[] key;
    if (loginNeeded) {
        initUKRForLogin();
        if ((ukrForLogin) == null) {
            return null;
        }
        key = org.commcare.models.encryption.ByteEncrypter.wrapByteArrayWithString(ukrForLogin.getEncryptedKey(), password);
    }else {
        key = org.commcare.CommCareApplication._().getSession().getLoggedInUser().getWrappedKey();
    }
    this.publishProgress(org.commcare.tasks.DataPullTask.PROGRESS_CLEANED);
    return key;
}