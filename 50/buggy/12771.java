@java.lang.Override
public void removeSecurityKey(java.lang.String accountName, byte[] publicKey) throws com.google.u2f.U2FException {
    dataStore.removeSecuityKey(accountName, publicKey);
}