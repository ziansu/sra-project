@java.lang.Override
public void handlePost(net.minecraft.item.ItemStack bookStack) {
    net.minecraftforge.fml.common.registry.GameRegistry.addShapedRecipe(new net.minecraft.util.ResourceLocation("guideapi", "testbook1"), bookStack, "X X", " X ", "X X", 'X', "ingotIron");
}