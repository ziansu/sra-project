@java.lang.Override
public void processClient(engine.network.client.Client client) {
    engine.network.client.ClientClient target = client.getClient(getSlot());
    if ((target != null) && ((target.playerMob) != null)) {
        client.level.getObject(getX(), getY()).interact(client.level, getX(), getY(), target.playerMob);
    }
}