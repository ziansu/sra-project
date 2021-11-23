public void processClient(engine.network.client.Client client) {
    if ((client.players[getSlot()]) == null) {
        client.players[getSlot()] = new engine.network.client.ClientClient(client, this);
    }else {
        client.players[getSlot()].applyPacket14SpawnPlayer(this);
    }
    client.loading.submitPlayerLoaded(getSlot());
}