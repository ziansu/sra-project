public void handle(javafx.event.ActionEvent arg0) {
    model.resetPlayerRoll();
    view.b_fertigGame.setDisable(true);
    view.turnPL1.setVisible(false);
    view.turnPL2.setVisible(true);
    server.sendObject(new message.ClientTurn(false));
}