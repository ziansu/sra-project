@java.lang.Override
public void connected(final com.esotericsoftware.kryonet.Connection connection) {
    objectSpace.addConnection(connection);
    com.github.TheDwoon.robots.game.interaction.AI ai = new com.github.TheDwoon.robots.server.AIServer.NetworkAI(com.esotericsoftware.kryonet.rmi.ObjectSpace.getRemoteObject(connection, 1, com.github.TheDwoon.robots.game.interaction.AI.class));
    new java.lang.Thread(() -> gameManager.spawnAi(ai)).start();
    synchronized(clients) {
        clients.put(connection, ai);
    }
}