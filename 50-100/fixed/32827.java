@Test
public void all_returnsAllInstancesOfClient_true() {
    Client firstClient = new Client("Client1");
    firstClient.save();
    Client secondClient = new Client("Client2");
    secondClient.save();
    assertEquals(true, Client.all().get(0).equals(firstClient));
    assertEquals(true, Client.all().get(1).equals(secondClient));
}