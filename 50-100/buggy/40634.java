public static void dumpHeldItem(@javax.annotation.Nullable
net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper network, @javax.annotation.Nonnull
net.minecraft.entity.player.EntityPlayer player, boolean verbose) {
    net.minecraft.item.ItemStack item = player.getHeldItemMainhand();
    if (mcjty.lib.tools.ItemStackTools.isEmpty(item)) {
        return ;
    }
    java.lang.String output = mcjty.lib.debugtools.DumpItemNBT.dumpItemNBT(item, verbose);
    mcjty.lib.varia.Logging.getLogger().log(Level.INFO, "### Client side ###");
    mcjty.lib.varia.Logging.getLogger().log(Level.INFO, output);
    if (network != null) {
        network.sendToServer(new mcjty.lib.network.PacketDumpItemInfo(item, verbose));
    }
}