public void dropItem(game.Item item, game.Floor floor, int inventorySpace) {
    inventory[inventorySpace] = null;
    inventorySpaces[inventorySpace] = false;
    (itemsInInventory)--;
    if (item.isEquipped) {
        if (item instanceof game.Weapon)
            equippedWeapon = null;
        else
            if (item instanceof game.Armor)
                equippedArmor = null;
            
        
    }
    floor.itemLocations[((this.x1) / (game.Player.TILE_SIZE))][((this.y1) / (game.Player.TILE_SIZE))] = item;
    floor.itemsOnFloor.add(item);
}