private void startRecording(net.minecraft.entity.player.EntityPlayer player) {
    if ((this.directorBlock) == null) {
        return ;
    }
    net.minecraft.tileentity.TileEntity tile = player.worldObj.getTileEntity(this.directorBlock);
    if ((tile != null) && (tile instanceof mchorse.blockbuster.common.tileentity.TileEntityDirector)) {
        ((mchorse.blockbuster.common.tileentity.TileEntityDirector) (tile)).startRecording(this, player);
    }
}