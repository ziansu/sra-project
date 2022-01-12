@java.lang.Override
public boolean onBlockActivated(net.minecraft.world.World worldIn, net.minecraft.util.BlockPos pos, net.minecraft.block.state.IBlockState state, net.minecraft.entity.player.EntityPlayer playerIn, net.minecraft.util.EnumFacing side, float hitX, float hitY, float hitZ) {
    if (worldIn.isRemote) {
        net.minecraft.util.ChatComponentText text = new net.minecraft.util.ChatComponentText("Opening Console");
        playerIn.addChatComponentMessage(text);
        net.minecraft.tileentity.TileEntity entity = worldIn.getTileEntity(pos);
        if (entity instanceof com.minespaceships.mod.overhead.ChatRegisterEntity) {
            ((com.minespaceships.mod.overhead.ChatRegisterEntity) (entity)).Activate(playerIn);
        }
    }else {
        worldIn.getTileEntity(pos);
    }
    return true;
}