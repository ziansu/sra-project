private void reInit() {
    player = org.terasology.registry.CoreRegistry.get(org.terasology.logic.players.LocalPlayer.class).getCharacterEntity();
    if ((player) == (org.terasology.entitySystem.entity.EntityRef.NULL)) {
        return ;
    }
}