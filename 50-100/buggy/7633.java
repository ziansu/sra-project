private java.util.List<java.net.URI> parseLocationsFromBody(java.lang.String body) throws cz.cesnet.cloud.occi.exception.ParsingException {
    cz.cesnet.cloud.occi.parser.TextParser.LOGGER.debug("Reading response body.");
    java.lang.String replaced = body.replaceAll("X-OCCI-Location:\\s*", "");
    java.lang.String[] lines = replaced.split("[\\r\\n]+");
    return makeURIList(lines);
}