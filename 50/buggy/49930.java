@java.lang.Override
public void onContainerClosed(net.minecraft.entity.player.EntityPlayer playerIn) {
    super.onContainerClosed(playerIn);
    tileEntityHenhouse.closeInventory(playerIn);
}