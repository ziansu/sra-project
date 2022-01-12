public com.nabto.api.NabtoStatus getFingerprint(java.lang.String certId, java.lang.String[] fingerprint) {
    byte[] byteFingerprint = new byte[16];
    com.nabto.api.NabtoStatus ret = com.nabto.api.NabtoStatus.fromInteger(com.nabto.api.NabtoCApiWrapper.nabtoGetFingerprint(certId, byteFingerprint));
    for (int i = 0; i < (byteFingerprint.length); i++) {
        java.lang.String str = java.lang.String.format("%02x", byteFingerprint[i]);
        fingerprint[0] += (i != 0) ? ":" + str : str;
    }
    return ret;
}