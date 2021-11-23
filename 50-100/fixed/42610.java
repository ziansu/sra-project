public void spawnEntity(org.spongepowered.api.world.Location<org.spongepowered.api.world.World> location, org.spongepowered.api.entity.living.player.Player player, org.spongepowered.api.entity.EntityType type, int amount) {
    for (int i = 1; i <= amount; i++) {
        java.util.Optional<org.spongepowered.api.entity.Entity> entity = location.getExtent().createEntity(type, location.getPosition());
        location.getExtent().spawnEntity(entity.get(), org.spongepowered.api.event.cause.Cause.of(org.spongepowered.api.event.cause.NamedCause.source(player)));
    }
}