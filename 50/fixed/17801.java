private org.bouncycastle.crypto.tls.ProtocolVersion getVersionFromString(java.lang.String version) {
    if ("1.0".equals(version)) {
        return org.bouncycastle.crypto.tls.ProtocolVersion.DTLSv10;
    }else
        if ("1.2".equals(version)) {
            return org.bouncycastle.crypto.tls.ProtocolVersion.DTLSv12;
        }else {
            throw new java.lang.IllegalArgumentException("Invalid DTLS version");
        }
    
}