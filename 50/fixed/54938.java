public void dropAllFlyers() {
    synchronized(this.tickets) {
        for (net.minecraft.entity.player.EntityPlayerMP player : this.tickets.keySet()) {
            dropPlayer(player);
        }
    }
}