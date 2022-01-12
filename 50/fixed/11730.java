public void addInventory(res.Player player) {
    for (int i = 0; i < (player.getItems()); i++) {
        inventory.add(player.getItem(i));
    }
    genImage();
}