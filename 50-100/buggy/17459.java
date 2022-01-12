public java.util.List<java.lang.String> currentQueries() {
    java.util.List<java.lang.String> elements = new java.util.ArrayList<java.lang.String>();
    synchronized(queries) {
        java.util.Set<java.lang.String> queryids = queries.keys().elementSet();
        elements.addAll(queryids);
    }
    return elements;
}