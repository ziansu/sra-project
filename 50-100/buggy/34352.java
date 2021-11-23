@java.lang.Override
public void execute(net.minecraft.server.MinecraftServer server, net.minecraft.command.ICommandSender sender, java.lang.String[] args) throws net.minecraft.command.CommandException {
    if (sender instanceof net.minecraft.entity.player.EntityPlayer) {
        net.minecraft.entity.player.EntityPlayer player = ((net.minecraft.entity.player.EntityPlayer) (sender));
        player.setVelocity(0, 0, 0);
        com.lambdanum.raids.model.Position playerHome = getHomeForPlayer(player.getName());
        player.attemptTeleport(playerHome.getX(), playerHome.getY(), playerHome.getZ());
    }
}