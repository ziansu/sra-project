private int getIDFromList(java.util.List<java.lang.String> stringList) {
    java.lang.String idString = stringList.get(0);
    int id;
    try {
        id = java.lang.Integer.parseInt(idString);
    } catch (java.lang.NumberFormatException ex) {
        throw new java.lang.IllegalArgumentException(java.lang.String.format(lifetracker.parser.ParserImpl.ERROR_INVALID_ID, idString));
    }
    return id;
}