private java.util.Collection convertSerializedElementsToCollection(java.lang.Object[] elements, java.util.Collection collection) throws java.lang.Exception {
    java.util.List<java.lang.Object> list;
    if (elements == null) {
        list = java.util.Collections.EMPTY_LIST;
    }else {
        list = new java.util.ArrayList<java.lang.Object>(elements.length);
        for (java.lang.Object elem : elements) {
            elem = convertSerializedObjectToObject(elem);
            list.add(elem);
        }
    }
    collection.addAll(list);
    return collection;
}