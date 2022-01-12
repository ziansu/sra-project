@java.lang.Override
public forestry.api.greenhouse.IGreenhouseState getGreenhouseState(net.minecraft.world.World world, net.minecraft.util.BlockPos pos) {
    for (forestry.core.multiblock.IMultiblockControllerInternal controllerInternal : forestry.core.multiblock.MultiblockRegistry.getControllersFromWorld(world)) {
        if (controllerInternal instanceof forestry.greenhouse.multiblock.IGreenhouseControllerInternal) {
            if (controllerInternal.isAssembled()) {
                if (forestry.greenhouse.GreenhouseHelper.isPosiotionInGreenhouse(((forestry.greenhouse.multiblock.IGreenhouseControllerInternal) (controllerInternal)), pos)) {
                    return ((forestry.greenhouse.multiblock.IGreenhouseControllerInternal) (controllerInternal)).createState();
                }
            }
        }
    }
    return null;
}