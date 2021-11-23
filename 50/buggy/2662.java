private java.lang.String queryType(java.lang.String SQLquery) {
    java.lang.System.out.println(("DEBUG(queryType): " + (SQLquery.substring(0, SQLquery.indexOf(' ')))));
    return SQLquery.substring(0, SQLquery.indexOf(' '));
}