private static java.lang.String removeBaseUri(java.lang.String metadataId, java.net.URI baseUri) {
    return metadataId.replaceAll(baseUri.toString(), "").substring(1);
}