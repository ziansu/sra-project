private void moveClient(org.zapto.mike.mrstreamserver.Channel channel, org.zapto.mike.mrstreamserver.ClientHandler client) {
    boolean canJoin = true;
    if (canJoin && (channel != (client.getChannel()))) {
        client.setChannel(channel);
        channel.addClient(client);
    }else {
    }
}