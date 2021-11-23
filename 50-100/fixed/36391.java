public static java.lang.String GetSessionID(com.mongodb.DBCollection coll) {
    org.json.simple.JSONObject objectDB = null;
    java.lang.String tempKey = "";
    do {
        tempKey = org.apache.commons.lang3.RandomStringUtils.randomAlphanumeric(20);
        objectDB = ((org.json.simple.JSONObject) (coll.findOne(new com.mongodb.BasicDBObject("session", tempKey))));
    } while (objectDB != null );
    return tempKey;
}