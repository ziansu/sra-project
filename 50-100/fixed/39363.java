private boolean doAction(java.lang.String playersName) {
    if ((playersName.length()) < 2) {
        java.lang.System.out.println(("\nInvalid players name: " + "The name must be greater than one charater in length"));
        return false;
    }
    slayergame.model.Player player = slayergame.control.GameControl.createPlayer(playersName);
    if (player == null) {
        java.lang.System.out.println("\nError creating the player.");
        return false;
    }
    this.displayNextView(player);
    return true;
}