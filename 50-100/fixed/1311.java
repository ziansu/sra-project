@net.minecraftforge.fml.common.eventhandler.SubscribeEvent
public void onWorldTick(net.minecraftforge.fml.common.gameevent.TickEvent.WorldTickEvent e) {
    if (!(e.world.isRemote)) {
        if ((e.phase) == (TickEvent.Phase.END)) {
            e.world.profiler.startSection("network node ticking");
            for (com.raoulvdberge.refinedstorage.api.network.node.INetworkNode node : com.raoulvdberge.refinedstorage.apiimpl.API.instance().getNetworkNodeManager(e.world).all()) {
                node.update();
            }
            e.world.profiler.endSection();
        }
    }
}