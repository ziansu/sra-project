protected java.lang.String getCurrentServerURL() {
    if (serverURLs.isEmpty()) {
        parseServerURLs();
        if (serverURLs.isEmpty())
            throw new com.orientechnologies.orient.core.exception.OStorageException("Cannot create a connection to remote server because url list is empty");
        
    }
    return ((serverURLs.get(0)) + "/") + (getName());
}