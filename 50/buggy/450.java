public static void registerTiCon() {
    com.sixteencolorgames.supertechtweaks.compat.ticon.TiConCompatability logic = new com.sixteencolorgames.supertechtweaks.compat.ticon.TiConCompatability();
    MinecraftForge.EVENT_BUS.register(logic);
    com.sixteencolorgames.supertechtweaks.compat.ticon.TiConCompatability.registerMelting();
}