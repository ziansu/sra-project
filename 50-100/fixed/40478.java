private java.util.Collection convertSerializedElementsToCollection(java.util.List<java.lang.Object> elements, java.util.Collection collection) throws java.lang.Exception {
    java.util.List<java.lang.Object> list;
    if ((elements == null) || (elements.isEmpty())) {
        list = java.util.Collections.EMPTY_LIST;
    }else {
        list = new java.util.ArrayList<java.lang.Object>(elements.size());
        for (java.lang.Object elem : elements) {
            elem = convertSerializedObjectToObject(elem);
            list.add(elem);
        }
    }
    collection.addAll(list);
    return collection;
}