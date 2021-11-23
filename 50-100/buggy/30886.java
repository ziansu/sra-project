private void deleteEntitiesFromMemcache(java.util.Collection<com.universeprojects.cacheddatastore.Key> entityKeys) {
    java.util.ArrayList<java.lang.String> list = new java.util.ArrayList<java.lang.String>();
    for (com.universeprojects.cacheddatastore.Key key : entityKeys)
        list.add(((mcPrefix) + (key.toString())));
    
    mc.deleteAll(entityKeys);
}