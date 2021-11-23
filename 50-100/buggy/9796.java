public void onBreakBlock(net.minecraft.world.World worldIn) {
    if (worldIn.isRemote)
        return ;
    
    net.minecraftforge.fml.common.FMLLog.info("onBreakBlock in TileEntity");
    for (com.balrog.InfernalTech.energy.IEnergyChannel channel : this.channels) {
        channel.removeChannelConnection(this);
        channel.invalidate();
    }
    this.channels.clear();
    this.receivers = new cofh.api.energy.IEnergyReceiver[6];
    com.balrog.InfernalTech.energy.EnergyNetwork network = this.getNetwork();
    if (network != null)
        network.destroy();
    
}