public void eat() {
    futility.Output.revealByLine(("you ate " + (name)));
    Futility.game.player.getCurrentRoom().removeItem(this);
    Futility.game.player.die();
}