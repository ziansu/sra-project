@Test
public void save_assignsIdToObject() {
    Client myClient = new Client("Client1");
    myClient.save();
    Client savedClient = Client.all().get(0);
    assertEquals(myClient.getClientId(), savedClient.getClientId());
}