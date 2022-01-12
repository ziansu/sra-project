@java.lang.Override
protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
    fontRendererObj.drawString((invPlayer.player.capabilities.isCreativeMode ? net.minecraft.client.resources.I18n.format("container.lootChest.editing") : net.minecraft.client.resources.I18n.format(invLootChest.getInventoryName())), 8, 6, 4210752);
    fontRendererObj.drawString((invPlayer.hasCustomInventoryName() ? invPlayer.getInventoryName() : net.minecraft.client.resources.I18n.format(invPlayer.getInventoryName())), 8, ((ySize) - 94), 4210752);
}