protected static com.mcmoddev.lib.init.MMDCreativeTab getTab(java.lang.String modName, int id) {
    if (com.mcmoddev.lib.init.ItemGroups.itemGroupsByModID.containsKey(modName)) {
        if ((com.mcmoddev.lib.init.ItemGroups.itemGroupsByModID.get(modName).size()) > id) {
            com.mcmoddev.lib.init.MMDCreativeTab t = com.mcmoddev.lib.init.ItemGroups.itemGroupsByModID.get(modName).get(id);
            return t;
        }
    }
    return null;
}