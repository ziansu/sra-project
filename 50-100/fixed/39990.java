@java.lang.Override
public void handle(view.IView view, entities.player.IPlayer player) throws entities.player.InsufficientFundsException {
    view.showMessage("CHANCE_MOVE", player.getName(), this.move);
    this.position = (player.getPosition()) + (this.move);
    if ((this.position) < 1) {
        this.position = 40 + (this.position);
    }
    view.setPosition(player, this.position);
    player.setPosition(this.position);
}