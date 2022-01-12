private void regenerateChests() {
    for (com.AustinPilz.FridayThe13th.Manager.Game.ArenaChest chest : weaponChests) {
        chest.randomlyFill();
    }
    for (com.AustinPilz.FridayThe13th.Manager.Game.ArenaChest chest : itemChests) {
        chest.randomlyFill();
    }
}