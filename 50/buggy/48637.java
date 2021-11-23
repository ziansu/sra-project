public void testPreconditions() {
    assertNotNull("activity is null", activity);
    assertEquals(0, activity.last_notify);
}