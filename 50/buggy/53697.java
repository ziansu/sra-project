public static void toggleViewMenu(boolean x) {
    application.factories.MenuFactory.showGenomeSequence.setDisable(x);
    application.factories.MenuFactory.showOnlyThisStrain.setDisable(x);
    application.factories.MenuFactory.showPhylogeneticTree.setDisable(x);
    application.factories.MenuFactory.showSelectedStrains.setDisable(x);
    application.factories.MenuFactory.resetView.setDisable(x);
}