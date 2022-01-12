public static void setNetworkAt(net.minecraft.world.World w, net.minecraft.util.math.BlockPos p, com.ssblur.pandp.power.EnergyNetwork n) {
    if (((com.ssblur.pandp.power.EnergyNetworkRegistry.registry.size()) <= ((w.provider.getDimension()) + 1)) && ((com.ssblur.pandp.power.EnergyNetworkRegistry.registry.get(w.provider.getDimension())) != null))
        com.ssblur.pandp.power.EnergyNetworkRegistry.registry.get(w.provider.getDimension()).put(p, n);
    else {
        com.ssblur.pandp.power.EnergyNetworkRegistry.registry.put(w.provider.getDimension(), new java.util.HashMap<>());
    }
}