@java.lang.Override
public void init(net.minecraftforge.fml.common.event.FMLInitializationEvent event) {
    super.init(event);
    com.comze.sanman00.mods.minecraft.expotions.Main.getLogger().info(("Starting client-side init of Explosive Potions mod version " + (com.comze.sanman00.mods.minecraft.expotions.Main.VERSION)));
    java.lang.System.out.println("Creating resource location instance...");
    java.lang.System.out.println("Registering location...");
    net.minecraft.client.Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ItemExplosivePotion.instance, 0, new net.minecraft.client.resources.model.ModelResourceLocation("expotions:potion_explosive", "inventory"));
    java.lang.System.out.println("Adding shapeless recipe...");
    net.minecraftforge.fml.common.registry.GameRegistry.addShapelessRecipe(new net.minecraft.item.ItemStack(com.comze.sanman00.mods.minecraft.expotions.item.ItemExplosivePotion.instance), new net.minecraft.item.ItemStack(net.minecraft.init.Items.glass_bottle), new net.minecraft.item.ItemStack(net.minecraft.init.Items.gunpowder));
}