@java.lang.Override
public void setPassphrase(org.sufficientlysecure.keychain.util.Passphrase passphrase) {
    if ((mPassphrase) != null) {
        mPassphrase.removeFromMemory();
    }
    mPassphrase = passphrase;
}