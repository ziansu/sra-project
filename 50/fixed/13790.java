@java.lang.Override
public void validate() {
    super.validate();
    if ((worldObj.isRemote) && (hasHAM())) {
        powercrystals.minefactoryreloaded.MineFactoryReloadedClient.addTileToAreaList(this);
    }
}