@java.lang.Override
public void handle(javafx.scene.input.MouseEvent event) {
    if ((GameGUI.shipManipulator.getShipListLength()) == 5) {
        if (GameGUI.gameHelper.getP1Rolled()) {
            GameGUI.disableButtons();
            GameGUI.gameHelper.sendReady();
            GameGUI.setP1Ready();
        }else {
            new ErrorBox("Please roll for first move first.");
        }
    }else {
        new ErrorBox("Please drop all 5 ships onto your grid first.");
    }
}