@java.lang.Override
public void registerModels() {
    MechworksContent.ingots.registerItemModels();
    MechworksContent.nuggets.registerItemModels();
    registerItemBlockMeta(MechworksContent.metals);
    registerItemBlockMeta(MechworksContent.drawbridge);
    registerItemBlockMeta(MechworksContent.firestarter);
}