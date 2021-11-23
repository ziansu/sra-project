@net.minecraftforge.fml.common.Mod.EventHandler
public void init(net.minecraftforge.fml.common.event.FMLPreInitializationEvent event) {
    com.printfromminecraft.PrintFromMinecraft.printBlock = new com.printfromminecraft.PrintBlock();
    com.printfromminecraft.PrintFromMinecraft.proxy.registerRendering();
    com.printfromminecraft.PrintFromMinecraft.magicPrintWand = new com.printfromminecraft.MagicPrintWand();
    net.minecraftforge.fml.common.registry.GameRegistry.registerItem(com.printfromminecraft.PrintFromMinecraft.magicPrintWand, "magicPrintWand");
}