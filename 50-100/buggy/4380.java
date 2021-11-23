private boolean updateModel(net.minecraft.util.BlockPos pos, net.minecraft.world.World world) {
    java.util.EnumMap<net.minecraft.util.EnumFacing, dabble.redstonemod.util.EnumModel> model = this.getModel(pos, world);
    if (!(model.equals(dabble.redstonemod.util.ModelLookup.getModel(pos, world, this)))) {
        dabble.redstonemod.util.ModelLookup.putModel(pos, model, world);
        return true;
    }else
        return false;
    
}