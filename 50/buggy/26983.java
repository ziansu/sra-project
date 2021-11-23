private static void addItem(net.minecraft.item.Item item, java.lang.String name) {
    tbsc.tbsccore.init.ItemInit.registeredItems.put(name, item);
    cpw.mods.fml.common.registry.GameRegistry.registerItem(item, name);
}