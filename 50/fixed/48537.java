@cpw.mods.fml.common.Mod.EventHandler
public void registerCommand(cpw.mods.fml.common.event.FMLServerStartingEvent event) {
    net.minecraft.command.ServerCommandManager serverCommandManager = ((net.minecraft.command.ServerCommandManager) (event.getServer().getCommandManager()));
    serverCommandManager.registerCommand(new eNTeR.fxz.spawneggcraft.command.CommandBoom());
}