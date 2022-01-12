public void testClear() throws java.lang.Exception {
    stateSet.clear();
    assertEquals("Cleared set should be empty", 0, stateSet.states.size());
}