@org.junit.Test
public void set_element_and_ensure_size() {
    com.artemis.utils.Bag<java.lang.Integer> b = new com.artemis.utils.Bag<java.lang.Integer>();
    for (int i = 0; 10 > i; i++) {
        b.add(i);
    }
    b.set(4, (-10));
    org.junit.Assert.assertEquals(10, b.size());
}