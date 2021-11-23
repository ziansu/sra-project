@org.junit.Test
public boolean isAnyNull() throws java.lang.Exception {
    assertNoNull();
    assertNoNull("a", "b", "c");
    assertNoNull(1, 2, 3, 4);
    assertNoNull(1);
    assertHaveNull(null);
    assertHaveNull("1", "2", null);
    assertHaveNull(null, null, null);
}