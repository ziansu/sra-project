private void initSignatures() {
    setSignatureFactories(java.util.Arrays.<org.apache.sshd.common.NamedFactory<org.apache.sshd.common.Signature>>asList(new org.apache.sshd.common.signature.SignatureDSA.Factory(), new org.apache.sshd.common.signature.SignatureRSA.Factory()));
}