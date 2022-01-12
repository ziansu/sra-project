@org.junit.Test
public void testDestroySmallBubble() {
    org.mockito.Mockito.when(circle.getRadius()).thenReturn(9.0);
    bubble.splitBubble(1);
    org.mockito.Mockito.verify(circle).destroy();
}