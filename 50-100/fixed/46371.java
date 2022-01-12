private java.lang.String getURL(int year) {
    java.lang.String url = "";
    java.text.MessageFormat query = new java.text.MessageFormat(ufLink);
    java.lang.Object[] queryObjects = new java.lang.Object[]{ java.lang.Integer.toString(year) };
    url = query.format(queryObjects);
    return url;
}