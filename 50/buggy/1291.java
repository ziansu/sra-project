public java.util.List<lcmc.utilities.UpdatableItem> getPulldownMenu() {
    final java.util.List<lcmc.utilities.UpdatableItem> items = virtualDomainInfo.createPopup();
    addVncViewersToTheMenu(items);
    return items;
}