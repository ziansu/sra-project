@org.junit.Test
public void testRemoveNullItem() {
    boolean result = mc.removeItem(0);
    assertFalse(result);
}