@java.lang.Override
public void onPostTick(gregtech.api.interfaces.tileentity.IGregTechTileEntity aBaseMetaTileEntity, long aTick) {
    if ((mProgresstime) >= ((mMaxProgresstime) - 1)) {
        if (((this.mOutputItems[0]) != null) && (this.mOutputItems[0].getUnlocalizedName().equals("gt.metaitem.01.32707"))) {
            GT_Mod.instance.achievements.issueAchievement(aBaseMetaTileEntity.getWorld().getPlayerEntityByName(aBaseMetaTileEntity.getOwnerName()), "scanning");
        }
    }
    super.onPostTick(aBaseMetaTileEntity, aTick);
}