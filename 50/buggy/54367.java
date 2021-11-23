private int findUriID(java.lang.String uri) {
    java.lang.Integer id = uriRefIds.get(uri);
    if (id != null)
        return id;
    
    return -2;
}