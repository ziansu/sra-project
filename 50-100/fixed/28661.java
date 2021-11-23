public void unequip(int slot) {
    if ((getInventory().size()) < (Server.Creatures.ServerPlayer.MAX_INVENTORY)) {
        if (slot == (Server.Creatures.ServerPlayer.DEFAULT_ARMOUR_SLOT)) {
            getInventory().add(equippedArmour);
            getBody().destroy();
            setBody(null);
            equippedArmour = null;
        }else
            if (slot == (Server.Creatures.ServerPlayer.DEFAULT_SHIELD_SLOT)) {
            }else {
                getInventory().add(equippedWeapons[slot]);
                equippedWeapons[slot] = null;
            }
        
    }
}