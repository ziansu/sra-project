private int searchNextBlock(int blocksChecked, @org.jetbrains.annotations.NotNull
net.minecraft.util.math.BlockPos position, net.minecraft.util.EnumFacing direction, @org.jetbrains.annotations.NotNull
net.minecraft.world.World world) {
    if ((blocksChecked >= (com.minecolonies.entity.ai.citizen.farmer.Field.getMaxRange())) || (isNoPartOfField(world, position))) {
        return blocksChecked;
    }
    return searchNextBlock((blocksChecked + 1), position.offset(direction), direction, world);
}