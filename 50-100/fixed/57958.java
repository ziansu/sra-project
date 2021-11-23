@java.lang.Override
public void fmlLifeCycleEvent(net.minecraftforge.fml.common.event.FMLInitializationEvent event) {
    super.fmlLifeCycleEvent(event);
    net.minecraft.client.resources.model.ModelResourceLocation itemModelResourceLocation = new net.minecraft.client.resources.model.ModelResourceLocation(((com.super_deathagon.itemspecial.SpecialItems.MODID) + ":itemspecialspear"), "inventory");
    final int DEFAULT_ITEM_SUBTYPE = 0;
    net.minecraft.client.Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(CommonProxy.srh, DEFAULT_ITEM_SUBTYPE, itemModelResourceLocation);
}