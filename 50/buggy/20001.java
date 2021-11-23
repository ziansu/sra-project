@java.lang.Override
public void actionServer(net.minecraft.world.World world, net.minecraft.entity.player.EntityPlayerMP player) {
    EvilCraft._instance.getPacketHandler().sendToAllAround(new org.cyclops.evilcraft.network.packet.SanguinaryPedestalBlockReplacePacket(x, y, z, blockID), org.cyclops.cyclopscore.helper.LocationHelpers.createTargetPointFromEntityPosition(player, org.cyclops.evilcraft.network.packet.SanguinaryPedestalBlockReplacePacket.RANGE));
}