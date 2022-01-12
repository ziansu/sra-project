@ru.cscenter.Test
public void remove() throws java.lang.Exception {
    assertFalse(set.remove(10));
    assertFalse(set.remove(10));
    assertTrue(set.add(10));
    assertFalse(set.add(10));
    assertTrue(set.remove(10));
    assertFalse(set.remove(10));
    assertTrue(set.isEmpty());
}