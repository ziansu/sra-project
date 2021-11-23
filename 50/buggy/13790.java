@java.lang.Override
public void validate() {
    super.validate();
    onRotate();
    if ((worldObj.isRemote) && (hasHAM())) {
        powercrystals.minefactoryreloaded.MineFactoryReloadedClient.addTileToAreaList(this);
    }
}