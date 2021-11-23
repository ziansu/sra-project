@org.junit.Test
public void testSlowSwipe() {
    com.gmail.walles.johan.exactype.GestureListener listener = doSwipe(97, 23, 4200);
    org.mockito.Mockito.verify(listener).onSwipe(97.0F, 23.0F);
    org.mockito.Mockito.verifyNoMoreInteractions(listener);
}