@java.lang.Override
public boolean generate(net.minecraft.world.World world, java.util.Random rand, net.minecraft.util.math.BlockPos position) {
    if (eiteam.esteemedinnovation.block.BlockOreDepositGenerator.canReplace(position, world)) {
        return world.setBlockState(position, this.state);
    }
    return false;
}