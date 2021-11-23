@java.lang.Override
public void onContainerClosed(net.minecraft.entity.player.EntityPlayer playerIn) {
    super.onContainerClosed(playerIn);
    if ((playerIn.capabilities.isCreativeMode) == false)
        for (int i = 0; i < ((craftSize) * (craftSize)); ++i) {
            net.minecraft.item.ItemStack itemstack = this.craftMatrix.getStackInSlotOnClosing(i);
            if (itemstack != null) {
                playerIn.dropPlayerItemWithRandomChoice(itemstack, false);
            }
        }
    
    this.craftResult.setInventorySlotContents(0, ((net.minecraft.item.ItemStack) (null)));
}