public void drawPlayersInvAndHotbar(net.minecraft.entity.player.EntityPlayer player, int x, int y) {
    drawPlayersInv(player, x, y);
    drawPlayersHotBar(player, x, (y + 58));
}