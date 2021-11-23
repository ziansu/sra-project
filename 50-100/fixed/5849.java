public static void load(mcp.mobius.waila.api.IWailaRegistrar registrar) {
    java.lang.System.out.println("WailaCompatibility.load");
    if (!(com.sixteencolorgames.supertechtweaks.compat.waila.WailaCompatibility.registered)) {
        throw new java.lang.RuntimeException("Please register this handler using the provided method.");
    }
    if (!(com.sixteencolorgames.supertechtweaks.compat.waila.WailaCompatibility.loaded)) {
        registrar.registerBodyProvider(com.sixteencolorgames.supertechtweaks.compat.waila.WailaCompatibility.INSTANCE, com.sixteencolorgames.supertechtweaks.blocks.BlockOre.class);
        com.sixteencolorgames.supertechtweaks.compat.waila.WailaCompatibility.loaded = true;
    }
}