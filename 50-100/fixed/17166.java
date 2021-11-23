public multiplayerchess.PlayerMove turn() throws java.io.IOException {
    message.setText((((((team) + " (") + (name)) + ") ") + " TURN"));
    if ((team) == (COLOR.BLACK)) {
        mouseX = 7 - (mouseX);
        mouseY = 7 - (mouseY);
        newMouseX = 7 - (newMouseX);
        newMouseY = 7 - (newMouseY);
    }
    return new multiplayerchess.PlayerMove(team, mouseX, mouseY, newMouseX, newMouseY);
}