@org.junit.Test
public void variable() {
    assertEquals(3, ((long) (run(b.setLocalVariable(0, "x", b.one()), b.setLocalVariable(0, "y", b.two()), b.plus(0, $x, $y)))));
}