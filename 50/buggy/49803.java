public void testGetPosition() {
    hashTable.insert(1, "Blacksburg");
    assertEquals(4, hashTable.getPosition("Blacksburg"));
    assertEquals((-1), hashTable.getPosition("XXX"));
}