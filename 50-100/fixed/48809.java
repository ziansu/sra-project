@org.terasology.entitySystem.event.ReceiveEvent
public void onAutoMove(org.terasology.logic.delay.PeriodicActionTriggeredEvent event, org.terasology.entitySystem.entity.EntityRef entity) {
    if (event.getActionId().equals(org.terasology.logic.players.LocalPlayerSystem.AUTO_MOVE_ID)) {
        if (isAutoMove) {
            org.terasology.network.ClientComponent clientComponent = entity.getComponent(org.terasology.network.ClientComponent.class);
            org.terasology.math.geom.Vector3f viewDir = entity.getComponent(org.terasology.logic.location.LocationComponent.class).getWorldDirection();
            clientComponent.character.send(new org.terasology.logic.characters.CharacterImpulseEvent(viewDir.mul(8.0F)));
        }else
            if (!(isAutoMove)) {
                delayManager.cancelPeriodicAction(entity, org.terasology.logic.players.LocalPlayerSystem.AUTO_MOVE_ID);
            }
        
    }
}