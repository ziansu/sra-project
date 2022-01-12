@java.lang.Override
public boolean doAction(java.lang.String playersName) {
    if ((playersName.length()) < 2) {
        ViewLayer.ErrorView.display(this.getClass().getName(), ("\nInvalid players name:" + "The name must be greater than 1 character in length."));
        return false;
    }
    ModelLayer.Player player = ControlLayer.GameControl.createPlayer(playersName);
    if (player == null) {
        ViewLayer.ErrorView.display(this.getClass().getName(), "\nError creating the player.");
        return false;
    }
    this.displayNextView(player);
    return true;
}