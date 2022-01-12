@net.minecraftforge.fml.relauncher.SideOnly(value = net.minecraftforge.fml.relauncher.Side.CLIENT)
public static void initModel(net.minecraft.block.Block block) {
    if (Config.debug)
        java.lang.System.out.println(("Registered model for " + (block.getRegistryName())));
    
    if (!(shadows.plants.util.Util.isException(block)))
        net.minecraftforge.client.model.ModelLoader.setCustomModelResourceLocation(net.minecraft.item.Item.getItemFromBlock(block), 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(block.getRegistryName(), "inventory"));
    else
        if (shadows.plants.util.Util.isException(block))
            shadows.plants.util.Util.handleExceptionRenders(block);
        
    
}