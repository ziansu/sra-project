@java.lang.Override
public void buyProperty(entity.Player player, entity.Texts text, boundary.GUI_Commands gui) {
    if (player.getAccount().legalTransaction((-(this.price)))) {
        player.updateBalance((-(this.price)));
        this.owner = player;
        gui.setOwner(this.id, player.getName());
        player.updateNumTerritoryOwned(1);
    }
}