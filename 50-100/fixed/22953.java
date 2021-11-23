public static void loadCustomVillagerData() {
    java.util.Map<java.lang.String, java.lang.String> villagerFiles = net.crazysnailboy.mods.villagertrades.loaders.VillagerLoader.sortVillagers(net.crazysnailboy.mods.villagertrades.util.FileUtils.createFileMap("villagers", ModConfiguration.loadVillagersFromJar));
    for (java.lang.String fileName : villagerFiles.keySet()) {
        java.lang.String fileContents = villagerFiles.get(fileName);
        try {
            net.crazysnailboy.mods.villagertrades.loaders.VillagerLoader.loadVillagerFromFile(fileContents);
        } catch (java.lang.Exception ex) {
            VillagerTradesMod.logger.error(((("Error parsing \"" + fileName) + "\": ") + (ex.getMessage())));
        }
    }
}