public static java.lang.String getUniqueTitle(net.minecraft.world.World world) {
    java.util.List<net.torocraft.nemesissystem.registry.Nemesis> nemeses = net.torocraft.nemesissystem.registry.NemesisRegistryProvider.get(world).list();
    java.lang.String title = net.torocraft.nemesissystem.util.NemesisBuilder.getRandomTitle();
    while (!(net.torocraft.nemesissystem.util.NemesisBuilder.isUniqueTitle(title, nemeses))) {
        title = net.torocraft.nemesissystem.util.NemesisBuilder.getRandomTitle();
    } 
    return title;
}