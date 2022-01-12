@java.lang.Override
protected java.util.HashMap<java.lang.String, java.lang.Object> populateHeaders() {
    java.util.HashMap<java.lang.String, java.lang.Object> headerMap = super.populateHeaders();
    headerMap.put(pro.dbro.airshare.session.IdentityMessage.HEADER_ALIAS, localPeer.getAlias());
    headerMap.put(pro.dbro.airshare.session.IdentityMessage.HEADER_PUBKEY, pro.dbro.airshare.DataUtil.bytesToHex(localPeer.getPublicKey()));
    return headerMap;
}