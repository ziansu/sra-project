@org.junit.Test
public void testInsertEmpty() {
    PQTestKarl.empty.insert(1);
    assertFalse("Previously empty is still empty after insert", PQTestKarl.empty.isEmpty());
    assertEquals("Size does not update with insert of empty size", 0, PQTestKarl.empty.size());
    try {
        assertTrue("MaxVal not updated after insert on empty list", ((PQTestKarl.empty.peek()) == 1));
    } catch (QueueEmptyException q) {
        fail("MaxVal was not updated and QueueEmptyException was thrown");
    }
}