@net.minecraftforge.fml.common.eventhandler.SubscribeEvent
public static void onWorldClose(net.minecraftforge.event.world.WorldEvent.Unload event) {
    for (java.util.UUID uuid : com.tacosupremes.withsprinkles.common.utils.OfflinePlayerUtils.map.keySet()) {
        if (com.tacosupremes.withsprinkles.common.utils.OfflinePlayerUtils.map.containsKey(uuid)) {
            if (com.tacosupremes.withsprinkles.common.utils.OfflinePlayerUtils.mapEnder.containsKey(uuid))
                com.tacosupremes.withsprinkles.common.utils.OfflinePlayerUtils.saveOfflineEnderChest(uuid, false);
            
            com.tacosupremes.withsprinkles.common.utils.OfflinePlayerUtils.saveOfflineNBT(uuid, false);
        }
    }
}