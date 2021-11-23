private static org.bouncycastle.asn1.ASN1Sequence getTeeEncodedSequence(org.bouncycastle.asn1.ASN1Sequence keyDescriptionSequence) throws java.security.cert.CertificateParsingException {
    org.bouncycastle.asn1.ASN1Encodable asn1Encodable = keyDescriptionSequence.getObjectAt(com.google.u2f.server.impl.attestation.android.AndroidKeyStoreAttestation.DESCRIPTION_TEE_ENFORCED_INDEX);
    if ((asn1Encodable == null) || (!(asn1Encodable instanceof org.bouncycastle.asn1.ASN1Sequence))) {
        throw new java.security.cert.CertificateParsingException("Expected teeEnforced ASN1Sequence.");
    }
    return ((org.bouncycastle.asn1.ASN1Sequence) (asn1Encodable));
}