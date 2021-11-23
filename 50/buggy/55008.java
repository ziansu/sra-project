public void testConstructor() {
    org.jgroups.util.RingBuffer buf = new org.jgroups.util.RingBuffer(100, 1);
    java.lang.System.out.println(("buf = " + buf));
    assert (buf.capacity()) == 100;
}