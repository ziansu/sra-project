public org.jsoup.nodes.Node attr(java.lang.String attributeKey, java.lang.String attributeValue) {
    attributes.put(attributeKey.toLowerCase(), attributeValue);
    return this;
}