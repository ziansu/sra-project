@java.lang.Override
public void call(java.lang.String value) {
    assertEquals("last", value);
    latch.countDown();
}