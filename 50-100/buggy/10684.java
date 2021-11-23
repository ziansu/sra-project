@java.lang.Override
public void onUpdate(net.minecraft.item.ItemStack stack, net.minecraft.world.World world, net.minecraft.entity.Entity player, int slot, boolean isCurrent) {
    if ((stack != null) && ((stack.getTagCompound()) != null)) {
        net.minecraft.nbt.NBTTagCompound nbt = stack.getTagCompound();
        if ((nbt.hasKey("IsOpenDummy")) == true) {
            nbt.removeTag("IsOpenDummy");
            nbt.setBoolean("IsOpen", false);
        }
    }
}