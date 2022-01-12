@java.lang.Override
public boolean onBlockActivated(net.minecraft.world.World world, net.minecraft.util.BlockPos pos, net.minecraft.block.state.IBlockState state, net.minecraft.entity.player.EntityPlayer player, net.minecraft.util.EnumFacing side, float hitX, float hitY, float hitZ) {
    player.addChatMessage(new net.minecraft.util.ChatComponentText(world.getTileEntity(pos).toString()));
    player.openGui(CivCraft.instance, Lib.Gui.LAB, world, pos.getX(), pos.getY(), pos.getZ());
    return false;
}