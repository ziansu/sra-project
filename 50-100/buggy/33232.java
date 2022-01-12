public void loadNBTData(net.minecraft.nbt.NBTTagCompound input) {
    if (input.hasKey("halo")) {
        this.shouldRenderHalo = input.getBoolean("halo");
    }
    this.hasTeleported = true;
    this.cooldown = input.getInteger("hammer_cooldown");
    this.cooldownName = input.getString("notch_hammer_name");
    this.cooldownMax = input.getInteger("max_hammer_cooldown");
    this.lifeShardsUsed = input.getFloat("shards_used");
    this.accessories.readFromNBT(input.getTagList("accessories", 10));
}