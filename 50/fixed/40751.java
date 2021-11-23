@java.lang.Override
public void registerKeyBindings() {
    com.voodoofrog.vfdeath.config.ConfigHandler.GRAVE_KEY = new net.minecraft.client.settings.KeyBinding(net.minecraft.util.StatCollector.translateToLocal(Strings.KEY_GRAVE), org.lwjgl.input.Keyboard.KEY_G, "key.categories.inventory");
    this.keyHandler = new com.voodoofrog.vfdeath.handler.KeyHandler();
    net.minecraftforge.fml.common.FMLCommonHandler.instance().bus().register(keyHandler);
}