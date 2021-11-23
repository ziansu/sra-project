@java.lang.Override
public com.lacunasoftware.restpki.SignatureStartResult start() throws com.lacunasoftware.restpki.RestException, java.io.IOException {
    if ((certificate) == null) {
        throw new java.lang.RuntimeException("The certificate was not set");
    }
    com.lacunasoftware.restpki.PadesSignaturePostResponse response = startCommon();
    return new com.lacunasoftware.restpki.SignatureStartResult(response.getToken(), response.getCertificate(), response.getToSignData(), response.getToSignHash(), response.getDigestAlgorithmOid());
}