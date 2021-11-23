public static void test_matches() {
    assertTrue(monq.jfa.Regexp.matches("a+", "aaaaaaa", 0));
    assertFalse(monq.jfa.Regexp.matches("a+", "aaaab", 0));
    assertTrue(new monq.jfa.Regexp("abc+").matches("abccc"));
    java.lang.Exception e = null;
    try {
        monq.jfa.Regexp.matches("a(*", "b", 0);
    } catch (java.lang.IllegalArgumentException _e) {
        e = _e;
    }
    assertTrue((e instanceof java.lang.IllegalArgumentException));
}