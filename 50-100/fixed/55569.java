public static java.lang.String[] queryWhere(java.lang.String theQuery) {
    theQuery = theQuery.toLowerCase();
    int i = theQuery.indexOf(';');
    if ((theQuery.indexOf("where")) != (-1))
        theQuery = theQuery.substring(((theQuery.indexOf("where")) + 5), i);
    else
        return new java.lang.String[0];
    
    java.lang.String delims = "\\s+|;\\s*|(?<=[a-z])(?=[<>=])|(?<=[<>=])(?=(?:\"|\\d))|(?=&&)|(?=\\|\\|)";
    java.lang.String[] tokens = theQuery.split(delims);
    return tokens;
}