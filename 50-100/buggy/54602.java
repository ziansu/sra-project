private void switchToolsToN(int n) {
    net.minecraft.entity.player.EntityPlayer entityplayer = thebombzen.mods.autoswitch.AutoSwitch.mc.player;
    entityplayer.inventory.currentItem = n;
    java.lang.String name;
    if ((entityplayer.inventory.mainInventory[n]) == null) {
        name = "Nothing";
    }else {
        net.minecraft.util.ResourceLocation itemLocation = thebombzen.mods.autoswitch.AutoSwitch.findUniqueIdentifierFor(entityplayer.inventory.mainInventory[n].getItem());
        name = itemLocation.toString();
    }
    debug("Switching tools to %d, which is %s", n, name);
}