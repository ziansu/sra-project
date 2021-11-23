@Test
public void addBlock() throws java.lang.Exception {
    db.addBlock(hash_to_test, data_to_test);
    java.lang.String result = db.getData(hash_to_test);
    assertEquals(data_expected, result);
}