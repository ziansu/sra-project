private com.mongodb.DBObject parseParam(java.lang.String param) throws java.io.IOException {
    com.mongodb.DBObject objectQuery = null;
    if ((param == null) || (param.isEmpty())) {
        objectQuery = new com.mongodb.BasicDBObject();
    }else {
        objectQuery = ((com.mongodb.DBObject) (com.mongodb.util.JSON.parse(param)));
    }
    return objectQuery;
}