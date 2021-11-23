@java.lang.Override
public void execute(net.minecraft.server.MinecraftServer server, net.minecraft.command.ICommandSender sender, java.lang.String[] args) throws net.minecraft.command.CommandException {
    final de.longor.talecraft.client.ClientRenderer.VisualMode mode = de.longor.talecraft.client.ClientRenderer.VisualMode.valueOf(args[0]);
    de.longor.talecraft.proxy.ClientProxy.shedule(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            ClientProxy.proxy.getRenderer().setVisualizationMode(mode);
        }
    });
}