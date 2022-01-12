public static boolean deleteAll(org.bukkit.World world) {
    boolean success = true;
    java.io.File[] files = new java.io.File((((main.MinecraftDontStarve.defaultSavePath) + (world.getName())) + "/")).listFiles();
    for (java.io.File file : files) {
        if (file.isFile()) {
            success = success && (file.delete());
        }
    }
    return success;
}