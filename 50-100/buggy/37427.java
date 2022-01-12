@net.minecraftforge.fml.relauncher.SideOnly(value = net.minecraftforge.fml.relauncher.Side.CLIENT)
public static void setMap(java.util.Map<java.lang.Integer, java.lang.String> mapIn) {
    thut.api.terrain.BiomeType.typeMapClient.clear();
    java.util.ArrayList<thut.api.terrain.BiomeType> types = com.google.common.collect.Lists.newArrayList();
    for (java.lang.Integer i : mapIn.keySet()) {
        java.lang.String name = mapIn.get(i);
        thut.api.terrain.BiomeType type = thut.api.terrain.BiomeType.getBiome(name, true);
        thut.api.terrain.BiomeType.typeMapClient.put(i, type);
        types.add(type);
    }
}