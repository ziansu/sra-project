public static void main(java.lang.String[] args) {
    java.io.File troveModLoaderDirectory = new java.io.File((((java.lang.System.getenv("APPDATA")) + (java.io.File.separator)) + "Trove-Mod-Loader-Java"));
    java.io.File loadModsFile = new java.io.File(((troveModLoaderDirectory + (java.io.File.separator)) + "loadmods.txt"));
    com.xigbclutchix.trove.TroveModLoader.troveModLoaderGUI = new com.xigbclutchix.trove.TroveModLoaderGUI();
    com.xigbclutchix.trove.TroveModLoader.troveModLoaderGUI.setVisible(true);
    com.xigbclutchix.trove.TroveModLoader.troveModLoaderGUI.setSize(450, 190);
    com.xigbclutchix.trove.TroveUtils.setTroveFolderLocationAtStart(troveModLoaderDirectory);
    com.xigbclutchix.trove.TroveUtils.addModsFromTextFile(loadModsFile, true);
}