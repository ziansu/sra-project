@java.lang.Override
public void validate(com.couchbase.lite.Document doc) {
    java.util.Map<java.lang.String, java.lang.Object> result = new java.util.TreeMap<>();
    int count = 0;
    com.couchbase.lite.Dictionary dictObj = doc.getDictionary("dict");
    for (java.lang.String key : dictObj) {
        result.put(key, dict.getObject(key));
        count++;
    }
    org.junit.Assert.assertEquals(finalContent.size(), count);
    org.junit.Assert.assertEquals(finalContent, result);
}