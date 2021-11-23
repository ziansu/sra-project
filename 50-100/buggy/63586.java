private void sendClientUpdate() {
    if ((parent.getWorld().isRemote) == false) {
        com.lothrazar.cyclicmagic.component.bucketstorage.PacketFluidSync packet = new com.lothrazar.cyclicmagic.component.bucketstorage.PacketFluidSync(parent.getPos(), this.getFluid());
        for (net.minecraft.entity.player.EntityPlayer player : parent.getWorld().playerEntities) {
            if (player instanceof net.minecraft.entity.player.EntityPlayerMP) {
                net.minecraft.entity.player.EntityPlayerMP playerMP = ((net.minecraft.entity.player.EntityPlayerMP) (player));
                ModCyclic.logger.info(" sendToPlayer() ");
                ModCyclic.network.sendTo(packet, playerMP);
            }
        }
    }
}