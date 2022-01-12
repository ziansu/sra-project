@java.lang.Override
public org.apache.kerby.kerberos.kerb.spec.base.AuthToken decodeFromBytes(byte[] content) throws java.io.IOException {
    java.lang.String tokenStr = new java.lang.String(content);
    return decodeFromString(tokenStr);
}