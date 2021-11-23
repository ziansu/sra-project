@org.junit.Test
public void testDeleteDocument() {
    com.couchbase.lite.Document doc = createDocument("doc1");
    doc.set("name", "Scott Tiger");
    org.junit.Assert.assertFalse(doc.isDeleted());
    save(doc);
    db.delete(doc);
    org.junit.Assert.assertTrue(doc.isDeleted());
    org.junit.Assert.assertNull(doc.getObject("name"));
    org.junit.Assert.assertEquals(new java.util.TreeMap<>(), doc.toMap());
}