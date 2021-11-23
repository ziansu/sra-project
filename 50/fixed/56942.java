public void writeToDB(java.lang.String t, java.lang.String u) throws java.net.UnknownHostException {
    com.mongodb.BasicDBObject doc = new com.mongodb.BasicDBObject("title", t);
    doc.append("url", u);
    coll.insert(doc);
}