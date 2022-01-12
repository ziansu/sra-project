private boolean isSolid(org.spongepowered.api.world.Location<org.spongepowered.api.world.World> location) {
    java.util.Optional<org.spongepowered.api.data.property.block.MatterProperty> pp = location.getBlockType().getProperty(org.spongepowered.api.data.property.block.MatterProperty.class);
    return (pp.isPresent()) && ((pp.get().getValue()) == (MatterProperty.Matter.SOLID));
}