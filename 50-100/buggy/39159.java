protected com.mongodb.BasicDBList createObjectList(java.util.Collection collection) throws java.lang.Exception {
    com.mongodb.BasicDBList dbList = new com.mongodb.BasicDBList();
    for (java.lang.Object object : collection) {
        if (object instanceof io.liveoak.spi.state.ResourceState) {
            dbList.add(createObject(((io.liveoak.spi.state.ResourceState) (object))));
        }else
            if (object instanceof java.util.Collection) {
                dbList.add(createObjectList(((java.util.Collection) (object))));
            }else {
                dbList.add(object);
            }
        
    }
    return dbList;
}