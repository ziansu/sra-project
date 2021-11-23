@cpw.mods.fml.relauncher.SideOnly(value = cpw.mods.fml.relauncher.Side.CLIENT)
public void addInformation(net.minecraft.item.ItemStack par1ItemStack, net.minecraft.entity.player.EntityPlayer par2EntityPlayer, java.util.List par3List, boolean par4) {
    if ((par1ItemStack.getItemDamage()) == 0) {
        if ((par1ItemStack.stackTagCompound) == null) {
            par1ItemStack.stackTagCompound = new net.minecraft.nbt.NBTTagCompound();
            par1ItemStack.stackTagCompound.setInteger("Uses", 5);
        }
        par3List.add(("Uses remaining: " + (par1ItemStack.stackTagCompound.getInteger("Uses"))));
    }
}