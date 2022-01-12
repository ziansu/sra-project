@java.lang.Override
public void deserializeNBT(net.minecraft.nbt.NBTBase nbt) {
    com.bte.mod.capability.ChargeProvider.CHARGE_CAPABILITY.readNBT(this.instance, null, nbt);
}