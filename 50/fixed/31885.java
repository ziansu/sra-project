protected final java.lang.String getIdentifier() {
    return uriInfo.getPathParameters(false).getFirst(RestconfConstants.IDENTIFIER);
}