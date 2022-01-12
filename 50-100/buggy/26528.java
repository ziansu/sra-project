@java.lang.Override
public void processClient(engine.network.client.Client client) {
    if ((client.getPlayer(getSlot())) != null) {
        entity.mobs.Mob interactMob = engine.GlobalData.getLevelMob(getInteractMobID(), client.level);
        if (interactMob != null) {
            interactMob.interact(client.getPlayer(getSlot()));
        }else {
            client.sendPacket(new engine.network.packet.Packet20RequestMobData(getInteractMobID()));
        }
    }
}