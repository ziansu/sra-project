@java.lang.Override
public void landOnField(Players.PlayerController playerController, Fields.FieldController fieldController) {
    Players.Player jailedPlayer = playerController.getCurrentPlayer();
    jailedPlayer.setJail(true);
    Game.GameController.movement(((jailedPlayer.getPlace()) + 1), 11, jailedPlayer, fieldController, playerController);
    jailedPlayer.setPlace(10);
}