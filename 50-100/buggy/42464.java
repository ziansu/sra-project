public void addIcon(com.commandblockguy.catalogue.gui.icons.ShopIcon icon) {
    int slot = 0;
    if (!(sortedIcons.isEmpty())) {
        slot = (sortedIcons.get(((sortedIcons.size()) - 1)).itemSlot()) + 1;
        if ((slot % 9) == 8)
            slot++;
        
    }
    icon.setSlot(slot);
    sortedIcons.add(icon);
}