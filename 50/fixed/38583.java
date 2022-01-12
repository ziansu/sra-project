public byte[] getBinary(java.lang.String fieldName) {
    java.lang.String encoded = ((java.lang.String) (map.get(fieldName)));
    return encoded == null ? null : java.util.Base64.decode(encoded);
}