public void handle(javafx.scene.input.KeyEvent keyReleased) {
    javafx.scene.input.KeyCode keyCode = keyReleased.getCode();
    java.util.ArrayList<nl.tudelft.scrumbledore.level.Player> players = game.getCurrentLevel().getPlayers();
    for (nl.tudelft.scrumbledore.level.Player player : players) {
        player.addAction(nl.tudelft.scrumbledore.level.PlayerAction.invertAction(keybindings.getKeybinding(player).getAction(keyCode)));
    }
}