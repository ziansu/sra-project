protected final java.lang.String getIdentifier() {
    return uriInfo.getPathParameters().getFirst(RestconfConstants.IDENTIFIER);
}