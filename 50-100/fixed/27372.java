private cz.cesnet.cloud.occi.Collection parseCollectionFromBody(java.lang.String body, cz.cesnet.cloud.occi.parser.CollectionType collectionType) throws cz.cesnet.cloud.occi.exception.ParsingException {
    cz.cesnet.cloud.occi.parser.TextParser.LOGGER.debug("Reading body.");
    body = body.trim();
    java.lang.String replaced = body.replaceAll("Category:\\s*", "");
    replaced = replaced.replaceAll("Link:\\s*", "");
    replaced = replaced.replaceAll("X-OCCI-Attribute:\\s*", "");
    java.lang.String[] lines = replaced.split("[\\r\\n]+");
    return parseCollectionFromArray(lines, collectionType);
}