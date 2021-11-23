private boolean doAction(java.lang.String playersName) {
    if ((playersName.length()) < 2) {
        java.lang.System.out.println(("\nInvalid players name: " + "The name must be greater than one character in length"));
        return false;
    }
    byui.cit260.HideAndSeek.model.Player player = byui.cit260.HideAndSeek.control.GameControl.createPlayer(playersName);
    if (player == null) {
        java.lang.System.out.println("\nError creating the player.");
        return false;
    }
    this.displayNextView(player);
    return true;
}