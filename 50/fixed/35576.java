@java.lang.Override
public void cofh_validate() {
    super.cofh_validate();
    onRotate();
    if ((worldObj.isRemote) && (hasHAM())) {
        powercrystals.minefactoryreloaded.MineFactoryReloadedClient.addTileToAreaList(this);
    }
}