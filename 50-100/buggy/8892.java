public static final void updatePlayer(net.minecraft.entity.player.EntityPlayer player) {
    if (player instanceof net.minecraft.entity.player.EntityPlayerMP) {
        net.minecraft.entity.player.EntityPlayerMP playerMP = ((net.minecraft.entity.player.EntityPlayerMP) (player));
        net.ci010.attributesmod.properties.Attributes.agility.upgrade(playerMP);
        net.ci010.attributesmod.properties.Attributes.endurance.upgrade(playerMP);
        net.ci010.attributesmod.properties.Attributes.power.upgrade(playerMP);
        net.ci010.attributesmod.network.PacketDispatcher.sendTo(new net.ci010.attributesmod.network.SynAttributesMessage(playerMP), playerMP);
    }
}