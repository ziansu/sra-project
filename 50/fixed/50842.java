@Test
public void update_updatesClient_true() {
    mClient.save();
    mClient.update("This guy is okay.");
    assertEquals("This guy is okay.", Client.find(mClient.getId()).getInfo());
}