public void testRemove() {
    hashTable.insert(1, "Blacksburg");
    assertEquals(4, hashTable.getPosition("Blacksburg"));
    assertEquals(1, hashTable.getHandle("Blacksburg"));
    hashTable.remove(hashTable.getPosition("Blacksburg"));
    assertEquals((-1), hashTable.getPosition("Blacksburg"));
    assertEquals((-1), hashTable.getHandle("Blacksburg"));
}