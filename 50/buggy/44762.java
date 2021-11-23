@org.real2space.neumann.approssi.core.value.Test
public void getValue() throws java.lang.Exception {
    org.real2space.neumann.approssi.core.value.Int64 actual = new org.real2space.neumann.approssi.core.value.Int64(11L);
    long expected = 1L;
    boolean isSame = (actual.getValue()) == expected;
    assertTrue(isSame);
}