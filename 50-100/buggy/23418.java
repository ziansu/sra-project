public void removePlayer(player.Player player, field[] arrayOfFields) {
    desktop_resources.GUI.setBalance(player.getName(), 0);
    this.removeOwnerShipFromPlayer(arrayOfFields, player);
    desktop_resources.GUI.removeCar(player.getPosition(), player.getName());
}