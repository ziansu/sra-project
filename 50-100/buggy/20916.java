public void test() {
    com.custommods.ai.Logger.debug(("Start Test" + (WalkMod.pathNavigator.run)));
    com.custommods.ai.Logger.debug(("get: " + (player.getItem(new net.minecraft.item.ItemStack(net.minecraft.item.Item.getItemById(4)), world, inventory))));
    com.custommods.ai.Logger.debug(("End Test" + (WalkMod.pathNavigator.run)));
}