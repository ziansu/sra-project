public void merge(lumbermill.api.JsonEvent event) {
    java.util.Iterator<java.lang.String> stringIterator = event.jsonNode.fieldNames();
    while (stringIterator.hasNext()) {
        java.lang.String field = stringIterator.next();
        jsonNode.set(field, event.jsonNode.get(field));
    } 
}