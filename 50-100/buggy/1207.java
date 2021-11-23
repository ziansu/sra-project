@cpw.mods.fml.common.Mod.EventHandler
public void init(cpw.mods.fml.common.event.FMLInitializationEvent event) {
    java.lang.System.out.println(("this.config: " + (this.config.toString())));
    Pixelmon.EVENT_BUS.register(new net.pixellife.shinynotifier.PixelmonCaptureHandler());
    java.sql.Connection con = net.pixellife.shinynotifier.DatabaseUtil.getConnection();
    java.lang.System.out.println(("con: " + (con.toString())));
    prepareDatabaseStatements(con);
    setupCommands();
}