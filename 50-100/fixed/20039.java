public void validate(java.util.List<java.lang.String> notifications) {
    if (biomes.isEmpty()) {
        notifications.add("No biomes for filter");
    }else {
        for (java.lang.String name : biomes) {
            if (!(amidst.mojangapi.world.biome.Biome.exists(name))) {
                notifications.add((("invalid biome name: '" + name) + "'"));
            }
        }
    }
}