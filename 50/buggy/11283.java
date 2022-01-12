@java.lang.Override
public void preInit() {
    MinecraftForge.EVENT_BUS.register(this);
    EnderCompassMod.ENDER_COMPASS.addPropertyOverride(new net.minecraft.util.ResourceLocation("angle"), new io.github.mribby.endercompass.client.EnderCompassAngleGetter());
    net.minecraftforge.client.model.ModelLoader.setCustomModelResourceLocation(EnderCompassMod.ENDER_COMPASS, 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation("endercompass:ender_compass", "inventory"));
}