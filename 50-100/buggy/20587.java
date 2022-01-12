private static net.minecraft.server.v1_11_R1.ItemStack book() {
    net.minecraft.server.v1_11_R1.NBTTagCompound bookNBT = new net.minecraft.server.v1_11_R1.NBTTagCompound();
    bookNBT.set("Count", new net.minecraft.server.v1_11_R1.NBTTagInt(1));
    bookNBT.set("id", new net.minecraft.server.v1_11_R1.NBTTagString("minecraft:written_book"));
    bookNBT.set("tag", iieWelcomeKit.Main.bookTag());
    return new net.minecraft.server.v1_11_R1.ItemStack(bookNBT);
}