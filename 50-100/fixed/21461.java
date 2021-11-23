@java.lang.Override
public boolean canInteractWith(net.minecraft.entity.player.EntityPlayer player) {
    if (player instanceof net.minecraft.entity.player.EntityPlayerMP) {
        if (!(crafters.contains(player))) {
            crafters.add(player);
        }
        sentNBT.clear();
    }
    net.minecraft.inventory.IInventory inventory = window.getInventory();
    return (inventory == null) || (inventory.isUseableByPlayer(player));
}