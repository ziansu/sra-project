public static void setUsingParachute(net.minecraft.entity.player.EntityPlayerMP player, micdoodle8.mods.galacticraft.core.entities.player.GCPlayerStats playerStats, boolean tf) {
    playerStats.setUsingParachute(tf);
    if (tf) {
        int subtype = -1;
        if (!(playerStats.getParachuteInSlot().isEmpty())) {
            subtype = playerStats.getParachuteInSlot().getItemDamage();
        }
        micdoodle8.mods.galacticraft.core.entities.player.GCPlayerHandler.sendGearUpdatePacket(player, micdoodle8.mods.galacticraft.core.entities.player.GCPlayerHandler.EnumModelPacketType.ADD, EnumExtendedInventorySlot.PARACHUTE, subtype);
    }else {
        micdoodle8.mods.galacticraft.core.entities.player.GCPlayerHandler.sendGearUpdatePacket(player, micdoodle8.mods.galacticraft.core.entities.player.GCPlayerHandler.EnumModelPacketType.REMOVE, EnumExtendedInventorySlot.PARACHUTE);
    }
}