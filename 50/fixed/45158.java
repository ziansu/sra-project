public static org.jsoup.nodes.Attribute createFromEncoded(java.lang.String unencodedKey, java.lang.String encodedValue) {
    java.lang.String value = org.jsoup.nodes.Entities.unescape(encodedValue, true);
    return new org.jsoup.nodes.Attribute(unencodedKey, value);
}