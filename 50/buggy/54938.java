public void dropAllFlyers() {
    for (net.minecraft.entity.player.EntityPlayerMP player : this.tickets.keySet()) {
        dropPlayer(player);
    }
}