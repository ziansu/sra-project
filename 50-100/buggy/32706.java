@net.minecraftforge.fml.common.Mod.EventHandler
public void preInit(net.minecraftforge.fml.common.event.FMLPreInitializationEvent event) {
    com.teamwizardry.librarianlib.LibrarianLib.logger = event.getModLog();
    com.teamwizardry.librarianlib.common.Config.initConfig(event.getSuggestedConfigurationFile());
    com.teamwizardry.librarianlib.LibrarianLib.proxy.preInit();
    PacketHandler.INSTANCE.getClass();
    if (Const.isDev)
        ClientCommandHandler.instance.registerCommand(new com.teamwizardry.librarianlib.ExampleBookCommand());
    
    com.teamwizardry.librarianlib.LibrarianLib.guide = new com.teamwizardry.librarianlib.book.Book(com.teamwizardry.librarianlib.LibrarianLib.MODID);
}