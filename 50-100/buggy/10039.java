private void moveClient(org.zapto.mike.mrstreamserver.Channel channel, org.zapto.mike.mrstreamserver.ClientHandler client) {
    boolean canJoin = true;
    java.lang.System.out.println((channel != (client.getChannel())));
    if (canJoin && (channel != (client.getChannel()))) {
        client.setChannel(channel);
        channel.addClient(client);
    }else {
    }
}