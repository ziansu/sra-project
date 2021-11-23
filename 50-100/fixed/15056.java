@java.lang.Override
public int isProvidingStrongPower(net.minecraft.world.IBlockAccess world, net.minecraft.util.BlockPos pos, net.minecraft.block.state.IBlockState state, net.minecraft.util.EnumFacing direction) {
    direction = direction.getOpposite();
    byte power = dabble.redstonemod.util.PowerLookup.getPower(pos, ((net.minecraft.world.World) (world)));
    java.util.EnumMap<net.minecraft.util.EnumFacing, dabble.redstonemod.util.EnumModel> model = dabble.redstonemod.util.ModelLookup.getModel(pos, ((net.minecraft.world.World) (world)));
    if ((model.containsKey(direction)) || (this.isPastePointingInDirection(direction, model)))
        return power;
    
    return 0;
}