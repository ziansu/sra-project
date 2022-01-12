public static boolean isPlayerOpped(com.mojang.authlib.GameProfile player) {
    if ((net.minecraft.server.MinecraftServer.getServer().getConfigurationManager().func_152606_n().length) > 0) {
        for (java.lang.String name : net.minecraft.server.MinecraftServer.getServer().getConfigurationManager().func_152606_n()) {
            if (name.toLowerCase().equals(player.getName().toLowerCase())) {
                return true;
            }
        }
        return false;
    }
    return true;
}