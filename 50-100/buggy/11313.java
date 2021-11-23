@java.lang.Override
public void addPopulators(org.spongepowered.api.world.gen.WorldGenerator generator) {
    generator.getGenerationPopulators().add(((org.spongepowered.api.world.gen.GenerationPopulator) (this.netherCaveGenerator)));
    this.genNetherBridge.worldObj = worldObj;
    if (this.field_177466_i) {
        generator.getGenerationPopulators().add(((org.spongepowered.api.world.gen.GenerationPopulator) (this.genNetherBridge)));
        generator.getPopulators().add(((org.spongepowered.api.world.gen.Populator) (this.genNetherBridge)));
    }
}