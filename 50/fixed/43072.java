public static boolean dropPlayerInventory(net.minecraft.entity.player.EntityPlayer player, java.lang.String timestamp) {
    com.m4thg33k.tombmanygraves.core.handlers.DeathInventory deathInventory = new com.m4thg33k.tombmanygraves.core.handlers.DeathInventory(player, null);
    return deathInventory.dropAll(player, timestamp);
}