public void actionPerformed(java.awt.event.ActionEvent event) {
    for (java.awt.Button button : GameField.buttons) {
        if ((event.getSource()) == button) {
            setUserMove(button);
            repaintBoard(button);
            beforeNextMoveChecking();
        }
    }
    changeUserTurn();
    java.awt.Button generatedMoveButton = generateMove();
    repaintBoard(generatedMoveButton);
    beforeNextMoveChecking();
    changeUserTurn();
}