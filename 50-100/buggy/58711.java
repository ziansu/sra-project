@java.lang.Override
public void apply() {
    java.lang.System.out.println(("Side: " + (net.minecraftforge.fml.common.FMLCommonHandler.instance().getEffectiveSide())));
    if ((net.minecraftforge.fml.common.FMLCommonHandler.instance().getSide()) == (net.minecraftforge.fml.relauncher.Side.SERVER))
        PacketHandler.INSTANCE.sendToAll(new minetweaker.mods.jei.MessageJEIHide(true, stack));
    else
        JEIAddonPlugin.itemRegistry.removeIngredientsAtRuntime(net.minecraft.item.ItemStack.class, minetweaker.mods.jei.JEIAddonPlugin.getSubTypes(stack));
    
}