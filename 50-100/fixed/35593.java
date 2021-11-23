public void unwrap(java.io.InputStream is, java.io.OutputStream os, org.ietf.jgss.MessageProp msgProp) throws org.ietf.jgss.GSSException {
    if (gssEncryptor.isV2()) {
        org.apache.kerby.kerberos.kerb.gss.impl.WrapTokenV2 token = new org.apache.kerby.kerberos.kerb.gss.impl.WrapTokenV2(this, msgProp, is);
        token.unwrap(os);
    }else {
        org.apache.kerby.kerberos.kerb.gss.impl.WrapTokenV1 token = new org.apache.kerby.kerberos.kerb.gss.impl.WrapTokenV1(this, msgProp, is);
        token.unwrap(os);
    }
}