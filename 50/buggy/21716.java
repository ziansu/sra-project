@java.lang.Override
public void onServerReceive(netzwerk.ServerClient client) {
    client.getConnection().close(client);
}