private java.util.List<org.bson.Document> parseTags(java.lang.String tags) {
    java.util.List<org.bson.Document> result = new java.util.LinkedList<>();
    java.lang.String[] tags_ = tags.split(",");
    for (java.lang.String tag : tags_) {
        tag = tag.trim();
        result.add(mongoDB.getTag(tag));
    }
    return result;
}