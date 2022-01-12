public java.util.List<com.alibaba.fastjson.JSONObject> find(java.lang.String collectionName, int limit, int skip, org.bson.conversions.Bson sort, org.bson.conversions.Bson projection, java.lang.String join) {
    return find(collectionName, new org.bson.BsonDocument(), projection, sort, limit, skip, join);
}