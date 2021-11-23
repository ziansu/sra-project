@java.lang.Override
public void writeToNBT(net.minecraft.nbt.NBTTagCompound par1) {
    super.writeToNBT(par1);
    if ((ship) != null) {
        int[] a = ship.getOriginMeasurementArray();
        par1.setIntArray(com.minespaceships.mod.overhead.ChatRegisterEntity.recoverSpaceshipMeasures, a);
    }
}