public int pickItem(org.dungeon.game.IssuedCommand issuedCommand) {
    if (canSee()) {
        org.dungeon.items.Item selectedItem = selectLocationItem(issuedCommand);
        if (selectedItem != null) {
            if (getInventory().isFull()) {
                org.dungeon.io.IO.writeString(Constants.INVENTORY_FULL);
            }else {
                getInventory().addItem(selectedItem);
                getLocation().removeItem(selectedItem);
                return org.dungeon.creatures.Hero.SECONDS_TO_PICK_UP_AN_ITEM;
            }
        }
    }else {
        org.dungeon.io.IO.writeString("It is too dark for you too see anything.");
    }
    return 0;
}