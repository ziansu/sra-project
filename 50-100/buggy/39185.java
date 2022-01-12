public void populatePanel(edu.psu.sweng500.team8.play.GameSession gameSession, boolean isRefresh, boolean isPencilMarkMode, edu.psu.sweng500.team8.gui.NumberButtonGUI numberInputPad) {
    this.gameSession = gameSession;
    this.numberInputPad = numberInputPad;
    for (int blockIndex = 0; blockIndex < 9; blockIndex++) {
        int rowIndex = blockIndex / 3;
        int columnIndex = blockIndex % 3;
        this.blocks[rowIndex][columnIndex].populate(gameSession.getGameBoard().getBlock(blockIndex), gameSession, isRefresh, this.numberPadHandler, isPencilMarkMode);
    }
}