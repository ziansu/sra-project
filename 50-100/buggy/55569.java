public static java.lang.String[] queryWhere(java.lang.String theQuery) {
    theQuery = theQuery.toLowerCase();
    int i = theQuery.indexOf(';');
    theQuery = theQuery.substring(((theQuery.indexOf("where")) + 5), i);
    java.lang.String delims = "\\s+|;\\s*|(?<=[a-z])(?=[<>=])|(?<=[<>=])(?=(?:\"|\\d))|(?=&&)|(?=\\|\\|)";
    java.lang.String[] tokens = theQuery.split(delims);
    return tokens;
}