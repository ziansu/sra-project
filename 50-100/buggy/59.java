@org.junit.Test
public void testReopenDB() {
    com.couchbase.lite.Document doc = createDocument("doc1");
    doc.set("string", "str");
    save(doc);
    reopenDB();
    doc = db.getDocument("doc1");
    org.junit.Assert.assertEquals("str", doc.getString("string"));
    java.util.Map<java.lang.String, java.lang.Object> expected = new java.util.TreeMap<>();
    expected.put("string", "str");
    org.junit.Assert.assertEquals(expected, doc.toMap());
}