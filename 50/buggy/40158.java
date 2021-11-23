private static net.minecraft.server.v1_11_R1.ItemStack boat() {
    net.minecraft.server.v1_11_R1.NBTTagCompound boatNBT = new net.minecraft.server.v1_11_R1.NBTTagCompound();
    boatNBT.set("Count", new net.minecraft.server.v1_11_R1.NBTTagInt(1));
    boatNBT.set("id", new net.minecraft.server.v1_11_R1.NBTTagString("minecraft:birch_boat"));
    return new net.minecraft.server.v1_11_R1.ItemStack(boatNBT);
}