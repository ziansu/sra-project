public void testAddWithInvalidSeqno() {
    org.jgroups.util.RingBuffer<java.lang.Integer> buf = new org.jgroups.util.RingBuffer<java.lang.Integer>(100, 20);
    assert (buf.add(10, 0)) == false;
    assert (buf.add(20, 0)) == false;
    assert (buf.size()) == 0;
}