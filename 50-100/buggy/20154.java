private static net.minecraftforge.fluids.Fluid getEntityFluid() {
    if ((com.robrit.moofluids.common.event.EntitySpawnHandler.SPAWNABLE_FLUIDS.length) > 0) {
        double activationWeight = (java.lang.Math.random()) * (com.robrit.moofluids.common.event.EntitySpawnHandler.CUMULATIVE_SPAWN_WEIGHT);
        double accumulatedWeight = 0.0;
        for (final net.minecraftforge.fluids.Fluid potentialEntityFluid : com.robrit.moofluids.common.event.EntitySpawnHandler.SPAWNABLE_FLUIDS) {
            final com.robrit.moofluids.common.entity.EntityTypeData entityData = com.robrit.moofluids.common.util.EntityHelper.getEntityData(potentialEntityFluid.getName());
            if (entityData == null) {
                continue;
            }
            accumulatedWeight += entityData.getSpawnRate();
            if (accumulatedWeight >= activationWeight) {
                return potentialEntityFluid;
            }
        }
    }
    return null;
}