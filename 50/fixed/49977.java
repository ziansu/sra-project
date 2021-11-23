public void testHeadline1() {
    java.lang.String result = headlineFormatter.getCleanString("and or");
    assertEquals("", result);
}