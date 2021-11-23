public void testGetHandle() {
    hashTable.insert(1, "Blacksburg");
    assertEquals(1, hashTable.getHandle("Blacksburg")[0]);
    assertEquals((-1), hashTable.getPosition("XXX")[0]);
}