public static org.ethereum.crypto.ECKey fromIdentityToPub(java.lang.String identity) {
    try {
        return org.ethereum.crypto.ECKey.fromPublicOnly(org.ethereum.util.ByteUtil.merge(new byte[]{ 4 }, org.spongycastle.util.encoders.Hex.decode(identity)));
    } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException((("Converting identity '" + identity) + "'"), e);
    }
}