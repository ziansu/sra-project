@java.lang.Override
public void preInit(net.minecraftforge.fml.common.event.FMLPreInitializationEvent event) {
    super.preInit(event);
    com.anzanama.everythinginbetween.Common.item.ItemsEIB.registerRenders();
    com.anzanama.everythinginbetween.Common.Block.BlocksEIB.registerRenders();
    com.anzanama.everythinginbetween.Common.Block.BlocksEIB.registerSpecialRenders();
}