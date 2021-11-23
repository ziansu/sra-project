public void setOpClientTurn() {
    model.resetPlayerRoll();
    view.topPaneGame.setId("topPaneGamePL2");
    view.turnPL1.setVisible(false);
    view.turnPL2.setVisible(true);
    view.b_würfeln.setDisable(true);
}