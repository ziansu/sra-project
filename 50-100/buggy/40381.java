public void testGetActiveIdentity() {
    assertTrue(((mService.getIdentities().getIdentities().size()) >= 0));
    de.qabel.core.config.Identity retrievedActiveIdentity = mService.getActiveIdentity();
    assertTrue(((mService.getIdentities().getIdentities().size()) >= 0));
    assertNotNull(retrievedActiveIdentity);
    assertEquals(identity, retrievedActiveIdentity);
}