public static java.lang.String GetTaskID(com.mongodb.DBCollection coll, java.lang.String username) {
    org.json.simple.JSONObject objectDB = null;
    java.lang.String tempKey = "";
    do {
        tempKey = org.apache.commons.lang3.RandomStringUtils.randomAlphanumeric(5);
        objectDB = ((org.json.simple.JSONObject) (coll.findOne(new com.mongodb.BasicDBObject("_id", username).append("task.id_task", tempKey))));
    } while (objectDB != null );
    return tempKey;
}