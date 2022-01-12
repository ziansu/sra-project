public void spawnEntity(org.spongepowered.api.world.Location<org.spongepowered.api.world.World> location, org.spongepowered.api.entity.living.player.Player player, org.spongepowered.api.entity.EntityType type, int amount) {
    for (int i = 1; i <= amount; i++) {
        org.spongepowered.api.world.extent.Extent extent = location.getExtent();
        java.util.Optional<org.spongepowered.api.entity.Entity> optional = extent.createEntity(type, location.getPosition());
        org.spongepowered.api.entity.Entity entity = optional.get();
        extent.spawnEntity(entity, org.spongepowered.api.event.cause.Cause.of(org.spongepowered.api.event.cause.NamedCause.source(player)));
    }
}