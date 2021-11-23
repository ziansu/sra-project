@Test
public void find_returnsClientWithSameId_secondClient() {
    Client firstClient = new Client("Client1");
    firstClient.save();
    Client secondClient = new Client("Client2");
    secondClient.save();
    assertEquals(Client.find(secondClient.getId()), secondClient);
}