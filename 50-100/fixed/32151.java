@java.lang.Override
public defense.api.ILauncherContainer getLauncher() {
    if ((launcherPos) != null) {
        net.minecraft.tileentity.TileEntity tileEntity = worldObj.getTileEntity(((int) (launcherPos.xPos)), ((int) (launcherPos.yPos)), ((int) (launcherPos.zPos)));
        if ((tileEntity != null) && (tileEntity instanceof defense.api.ILauncherContainer)) {
            if (!(tileEntity.isInvalid())) {
                return ((defense.api.ILauncherContainer) (tileEntity));
            }
        }
    }
    return null;
}