public boolean subKeysHaveSamePassphrase() {
    if ((mSubkeyPassphrases.size()) < 2) {
        return true;
    }else {
        org.sufficientlysecure.keychain.util.Passphrase previous = null;
        for (org.sufficientlysecure.keychain.util.Passphrase current : mSubkeyPassphrases.values()) {
            if ((previous != null) && (!(current.equals(previous)))) {
                return false;
            }
            previous = current;
        }
        return true;
    }
}