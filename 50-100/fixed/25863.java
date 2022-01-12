public void load() {
    synchronized(this) {
        try {
            net.minecraft.world.storage.MapStorage data = getData();
            net.minecraft.world.WorldSavedData wsd = data.loadData(getClass(), getName());
            net.minecraft.nbt.NBTTagCompound nbt = new net.minecraft.nbt.NBTTagCompound();
            wsd.writeToNBT(nbt);
            readFromNBT(nbt);
        } catch (java.lang.NullPointerException e) {
        }
    }
}