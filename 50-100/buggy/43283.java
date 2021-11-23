public boolean validTimeStamp(java.lang.String bigInt, com.mongodb.client.FindIterable<org.bson.Document> allCookies, com.mongodb.client.MongoCollection cookieCollection) {
    boolean authenticated = false;
    for (org.bson.Document cookie : allCookies) {
        if (inPast(cookie.getString("expires"))) {
            cookieCollection.findOneAndDelete(cookie);
        }else
            if (cookie.getString("number").equals(bigInt)) {
                authenticated = true;
            }
        
    }
    return authenticated;
}