@org.junit.Test
public void testStartsPending() {
    assertTrue(block.isPending());
    assertTrue(block.getMessage().contains("pending"));
    verifyZeroInteractions(mockReconciler);
}