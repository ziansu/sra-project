private void if_(boolean cond, int expected) {
    assertEquals(expected, ((long) (run(b.setLocalVariable(0, "x", b.zero()), b.if_(b.constant(cond), b.setLocalVariable(0, "x", b.one()), b.setLocalVariable(0, "x", b.two())), $x))));
}