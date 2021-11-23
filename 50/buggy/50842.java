@Test
public void update_updatesClient_true() {
    mClient.save();
    mClient.update("This guy is okay.");
    assertEquals("This guy is great.", Client.find(mClient.getId()).getInfo());
}