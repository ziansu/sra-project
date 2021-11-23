@org.junit.Test
public void testRegister() {
    list.register(dummyListener);
    assertListNumberListenersEquals(4);
    list.register(dummyListener2);
    assertListNumberListenersEquals(2);
}