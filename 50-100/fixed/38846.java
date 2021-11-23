public void testRemove() {
    hashTable.insert(1, "Blacksburg");
    assertEquals(4, hashTable.getPosition("Blacksburg")[0]);
    assertEquals(1, hashTable.getHandle("Blacksburg")[0]);
    hashTable.remove(hashTable.getPosition("Blacksburg")[0]);
    assertEquals((-1), hashTable.getPosition("Blacksburg")[0]);
    assertEquals((-1), hashTable.getHandle("Blacksburg")[0]);
}