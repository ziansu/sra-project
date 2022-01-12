public void testSwitchMajor() {
    setup();
    Selector sel = new Selector();
    java.util.ArrayList<Course> from = new java.util.ArrayList(a.getCourses());
    java.util.ArrayList<Course> to = new java.util.ArrayList(b.getCourses());
    actual = sel.switch_major(from, to, 1);
    boolean correct = actual.getCourses().containsAll(expected.getCourses());
    assertTrue(correct);
}