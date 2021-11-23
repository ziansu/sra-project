@java.lang.Override
public void onMachineActivated() {
    if (this.worldObj.isRemote) {
        return ;
    }
    int metadata = this.getBlockMetadata();
    if (erogenousbeef.bigreactors.common.block.BlockReactorPart.isController(metadata)) {
        this.worldObj.setBlockMetadataWithNotify(this.xCoord, this.yCoord, this.zCoord, BlockReactorPart.CONTROLLER_ACTIVE, 2);
    }
}