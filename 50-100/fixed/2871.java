public static boolean sendToDefaultSpawn(java.lang.String playername) {
    if ((net.minecraft.server.MinecraftServer.getServer().getConfigurationManager().func_152612_a(playername)) != null) {
        net.minecraft.entity.player.EntityPlayer player = net.minecraft.server.MinecraftServer.getServer().getConfigurationManager().func_152612_a(playername);
        if ((player.getBedLocation(0)) != null) {
            return net.quetzi.qutilities.helpers.MovePlayer.sendToBed(playername);
        }else {
            return net.quetzi.qutilities.helpers.MovePlayer.sendToDimension(playername, 0);
        }
    }
    return net.quetzi.qutilities.helpers.MovePlayer.sendToDimension(playername, 0);
}