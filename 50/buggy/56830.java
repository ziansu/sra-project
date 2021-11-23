@java.lang.Override
public void entityInit() {
    this.dataWatcher.addObject(16, (-1));
    this.dataWatcher.addObject(17, 0);
    this.chunkLoaderInit(net.minecraftforge.common.ForgeChunkManager.requestTicket(DefenseTech.INSTANCE, this.worldObj, Type.ENTITY));
}