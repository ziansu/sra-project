public void readFromNBT(net.minecraft.nbt.NBTTagCompound compound) {
    super.readFromNBT(compound);
    this.rotation = compound.getByte("Rot");
    this.runState = compound.getInteger("RunState");
    this.uuid = compound.getString("RadioID");
    if (this.uuid.equals("")) {
        this.uuid = java.util.UUID.randomUUID().toString();
    }
}