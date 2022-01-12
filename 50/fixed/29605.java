public java.lang.String getVenue(java.lang.String operation) throws java.lang.NullPointerException {
    if (operation == null) {
        logNullPointer(parser.Parser.EXCEPTION_NULLPOINTER);
    }
    return getContent("-v", operation);
}