public static void initFeatures() {
    if (((net.minecraftforge.fml.common.FMLCommonHandler.instance().getSidedDelegate()) != null) && (net.minecraftforge.fml.common.FMLCommonHandler.instance().getSide().isClient()))
        org.epoxide.surge.client.ProxyClient.registerClient();
    
    org.epoxide.surge.features.FeatureManager.registerFeature(new org.epoxide.surge.features.loadtime.FeatureLoadTimes(), "Load Time Analysis", "Records the load time of all mods being loaded.");
    org.epoxide.surge.features.FeatureManager.registerFeature(new org.epoxide.surge.features.pigsleep.FeaturePigmanSleep(), "Pigman Sleep", "Allow the player to sleep while pigman are around, unless angered");
}