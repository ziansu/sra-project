@org.junit.Test
public void longIntegersDivided() {
    long a = 12752242835177213L;
    long b = 1062912L;
    assertEquals(11997458712L, (a / b));
    assertEquals((-11997458712L), (a / (-b)));
}