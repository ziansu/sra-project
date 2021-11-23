@java.lang.Override
public int OnVerifyChangedCertificate(java.lang.String commonName, java.lang.String subject, java.lang.String issuer, java.lang.String fingerprint, java.lang.String oldSubject, java.lang.String oldIssuer, java.lang.String oldFingerprint) {
    this.OnVerifiyCertificate(commonName, subject, issuer, fingerprint, true);
    return 0;
}