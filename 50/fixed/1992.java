public void updateMenus(java.lang.String menuStructure, final java.util.Set<java.lang.String> plugins) {
    final org.freeplane.core.ui.IUserInputListenerFactory userInputListenerFactory = getUserInputListenerFactory();
    userInputListenerFactory.updateMenus(menuStructure, plugins);
}