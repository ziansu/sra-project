private static com.mcmoddev.lib.init.Item createItem(com.mcmoddev.lib.material.MMDMaterial material, com.mcmoddev.lib.data.Names name, java.lang.Class<? extends com.mcmoddev.lib.init.Item> clazz, boolean enabled, boolean extra, net.minecraft.creativetab.CreativeTabs tab) {
    if ((enabled && extra) && (!(material.hasItem(name)))) {
        com.mcmoddev.lib.init.Items.createItem(material, name.toString(), clazz, enabled, extra, tab);
    }
    return material.getItem(name);
}