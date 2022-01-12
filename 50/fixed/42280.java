@java.lang.Override
public net.minecraft.nbt.NBTTagCompound save(net.minecraft.nbt.NBTTagCompound nbt) {
    if ((ammo.size()) > 0) {
        com.builtbroken.armory.content.items.ItemClip.setAmmoDataStackIntoNBT("ammoData", nbt, ammo);
    }
    return nbt;
}