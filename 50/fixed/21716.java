@java.lang.Override
public void onServerReceive(netzwerk.ServerClient client) {
    if ((client.getConnection()) != null)
        client.getConnection().close(client);
    
}