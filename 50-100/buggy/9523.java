@java.lang.Override
public void updateEntity() {
    if (((this.getBlockMetadata()) & 8) == 0)
        return ;
    
    if ((!(this.worldObj.isRemote)) && ((occupied) != (((this.getBlockMetadata()) & 4) != 0))) {
        occupied = !(occupied);
        needsAnimation = true;
        markDirty();
    }else
        net.minecraft.block.BlockBed.func_149979_a(worldObj, xCoord, yCoord, zCoord, occupied);
    
}