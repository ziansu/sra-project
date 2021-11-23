private net.minecraft.server.IInventory addChest(java.lang.String playerName) {
    net.minecraft.server.IInventory chest = new me.meiamsome.myriadvirtual.MyriadChest((playerName + "'s Chest"), playerName);
    chests.put(playerName.toLowerCase(), chest);
    return chest;
}