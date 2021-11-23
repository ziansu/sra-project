@java.lang.Override
public com.intrbiz.bergamot.crypto.util.CertificatePair loadServer(java.lang.String commonName) {
    try {
        if (this.serverKeyFile(commonName).exists()) {
            return new com.intrbiz.bergamot.crypto.util.CertificatePair(this.serverCrtFile(commonName), this.serverKeyFile(commonName));
        }else {
            return new com.intrbiz.bergamot.crypto.util.CertificatePair(this.serverCrtFile(commonName), null);
        }
    } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException(("Failed to load certificate for server: " + commonName), e);
    }
}