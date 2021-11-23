public boolean addClientCertificate(java.lang.String cert_filepath, java.lang.String certificate_alias) {
    try {
        java.security.KeyStore clients_keyStore = loadKeyStore(ServerKeyManager.CLIENTS_KEYSTORE, PUBLIC_KEYSTORE_PASS.toCharArray());
        if (!(clients_keyStore.isCertificateEntry(certificate_alias))) {
            return false;
        }
        java.security.cert.Certificate cert = loadCertificate(cert_filepath);
        clients_keyStore.setCertificateEntry(certificate_alias, cert);
        saveKeyStore(clients_keyStore, ServerKeyManager.CLIENTS_KEYSTORE, PUBLIC_KEYSTORE_PASS.toCharArray());
    } catch (java.lang.Exception ex) {
        ex.printStackTrace();
        return false;
    }
    return true;
}