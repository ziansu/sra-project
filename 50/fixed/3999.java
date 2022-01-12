@org.junit.Test
public void testRemoveNullItem() {
    boolean result = mc.removeItem(null);
    assertFalse(result);
}