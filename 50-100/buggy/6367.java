public void saveMessage(java.lang.String mobile, com.leadtone.where.protocol.beans.WhereMessage message) {
    com.mongodb.DBCollection dbc = ds.getDB().getCollection("UndeliverMsgs");
    com.mongodb.BasicDBObject bdb = new com.mongodb.BasicDBObject();
    java.util.HashMap<java.lang.String, java.lang.Object> map = com.leadtone.where.protocol.converter.ProtocolConverter.convertWhereMessageToMap(message);
    bdb.putAll(map);
    com.mongodb.WriteResult result = dbc.insert(bdb);
    if ((result.getN()) == 0) {
        log.info("save undeliver message failed!");
    }
}