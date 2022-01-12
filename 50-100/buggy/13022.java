@java.lang.Override
public void update(float delta) {
    for (org.terasology.entitySystem.entity.EntityRef entity : entityManager.getEntitiesWith(org.terasology.miniion.components.NPCMovementInputComponent.class)) {
        org.terasology.miniion.components.NPCMovementInputComponent characterMovementComponent = entity.getComponent(org.terasology.miniion.components.NPCMovementInputComponent.class);
        org.terasology.logic.characters.CharacterComponent characterComp = entity.getComponent(org.terasology.logic.characters.CharacterComponent.class);
        entity.send(new org.terasology.logic.characters.CharacterMoveInputEvent(((inputSequenceNumber)++), 0, 0, characterMovementComponent.directionToMove, characterMovementComponent.runningRequested, characterMovementComponent.jumpingRequested, ((long) (delta))));
    }
}