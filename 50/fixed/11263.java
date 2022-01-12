public final java.security.cert.Certificate[] getCertificateChain() {
    if ((certChain) == null) {
        return null;
    }else {
        return java.util.Arrays.copyOf(certChain, certChain.length);
    }
}