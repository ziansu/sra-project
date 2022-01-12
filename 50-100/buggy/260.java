private net.minecraft.item.ItemStack transformBottle(net.minecraft.item.ItemStack input, net.minecraft.entity.player.EntityPlayer player, net.minecraft.item.ItemStack stack) {
    (input.stackSize)--;
    player.addStat(net.minecraft.stats.StatList.getObjectUseStats(input.getItem()));
    if ((input.stackSize) <= 0) {
        return stack;
    }else {
        if (!(player.inventory.addItemStackToInventory(stack))) {
            player.dropItem(stack, false);
        }
        return input;
    }
}