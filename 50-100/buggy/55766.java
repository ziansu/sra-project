@java.lang.Override
public void handle(view.IView view, entities.player.IPlayer player) throws entities.player.InsufficientFundsException {
    view.showMessage("CHANCE_MOVE_FIXED", player.getName(), this.position);
    if ((player.getPosition()) > (this.position)) {
        player.getAccount().deposit(4000);
        view.updateBalance(player);
    }
    player.setPosition(this.position);
    view.setPosition(player, this.position);
}