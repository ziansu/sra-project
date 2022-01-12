private java.util.Collection<java.lang.String> convertUriCollection(java.util.Collection<java.net.URI> uriList) {
    java.util.List<java.lang.String> idList = new java.util.ArrayList<java.lang.String>();
    java.util.Iterator<java.net.URI> it = uriList.iterator();
    while (it.hasNext()) {
        idList.add(it.next().toString());
        if ((idList.size()) > (com.emc.storageos.db.client.impl.DbClientImpl.DEFAULT_PAGE_SIZE)) {
            com.emc.storageos.db.client.impl.DbClientImpl._log.warn(("Unbounded database query, request size is over allowed limit({}), " + "please use corresponding iterative API."), com.emc.storageos.db.client.impl.DbClientImpl.DEFAULT_PAGE_SIZE);
        }
    } 
    return idList;
}