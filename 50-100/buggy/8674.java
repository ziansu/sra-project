public static com.flatworks.games.flatcraft.world.World simulateWorld(com.flatworks.games.flatcraft.world.World world) {
    com.flatworks.games.flatcraft.world.WorldGenerator.state("Simulating World...");
    for (int i = 0; i < 200; i++) {
        world.runTick();
        com.flatworks.games.flatcraft.world.WorldGenerator.progress((0.5F + (((float) (((double) (i)) / ((double) (200)))) * 0.5F)));
    }
    return world;
}