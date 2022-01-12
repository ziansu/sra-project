public void testGetPosition() {
    hashTable.insert(1, "Blacksburg");
    assertEquals(4, hashTable.getPosition("Blacksburg")[0]);
    assertEquals((-1), hashTable.getPosition("XXX")[0]);
}