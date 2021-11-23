@java.lang.Override
public void updateEntity() {
    if ((isErrored()) && (!(worldObj.isRemote)))
        worldObj.spawnParticle("angryVillager", ((xCoord) + (worldObj.rand.nextDouble())), ((yCoord) + (worldObj.rand.nextDouble())), ((zCoord) + (worldObj.rand.nextDouble())), 0, (-0.05), 0);
    
    if (cpw.mods.fml.common.Loader.isModLoaded("Thaumcraft"))
        thaumUpdate();
    
}