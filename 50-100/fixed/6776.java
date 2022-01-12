@java.lang.Override
public void init() {
    super.init();
    net.minecraft.item.Item itemBlockSimple = net.minecraftforge.fml.common.registry.GameRegistry.findItem("clonesmod", "cloner");
    net.minecraft.client.resources.model.ModelResourceLocation itemModelResourceLocation = new net.minecraft.client.resources.model.ModelResourceLocation("clonesmod:cloner", "inventory");
    net.minecraft.client.Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockSimple, 0, itemModelResourceLocation);
}