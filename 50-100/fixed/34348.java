@java.lang.Override
public boolean doAction(java.lang.String playersName) {
    if ((playersName.length()) < 2) {
        java.lang.System.out.println(("\nInvalid Players name:" + "The name mus be greater than one Character in lenght"));
        return false;
    }
    citbyu.cit260.journey.model.Player.Player player = controlGame.createThePlayer(playersName);
    if (player == null) {
        java.lang.System.out.println("\nError creating the player.");
        return false;
    }
    this.displayNextView(player);
    return true;
}