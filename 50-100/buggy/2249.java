@java.lang.Override
protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
    fontRendererObj.drawString((invLootChest.hasCustomInventoryName() ? invLootChest.getInventoryName() : net.minecraft.client.resources.I18n.format((invPlayer.player.capabilities.isCreativeMode ? "container.lootChest.editing" : "container.lootChest"))), 8, 6, 4210752);
    fontRendererObj.drawString((invPlayer.hasCustomInventoryName() ? invPlayer.getInventoryName() : net.minecraft.client.resources.I18n.format(invPlayer.getInventoryName())), 8, ((ySize) - 94), 4210752);
}