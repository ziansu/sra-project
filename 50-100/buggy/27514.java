@org.junit.Test
public void testReadString() throws java.lang.Exception {
    DataUnit d = new DataUnit(1);
    d.write(170);
    java.lang.System.out.println(d.readString());
    assertEquals("10101010", d.readString());
    DataUnit p = new DataUnit(2);
    p.write(43690);
    java.lang.System.out.println(p.readString());
    assertEquals("1010101010101010", p.readString());
}