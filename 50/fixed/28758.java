public boolean doesPlayerExist(java.lang.String username) {
    return players.containsKey(new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(username.getBytes())));
}