@org.junit.Test
public void testForceCompleteFromPending() {
    assertTrue(block.isPending());
    block.forceComplete();
    org.mockito.Mockito.when(mockReconciler.isReconciled()).thenReturn(true);
    assertTrue(block.isComplete());
}