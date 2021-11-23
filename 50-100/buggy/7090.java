public void setIsAI(boolean isAI) {
    if ((this.isAI) && (!isAI)) {
        com.dyllongagnier.triad.gui.controller.Players.resetAI();
    }
    boolean isDiff = isAI;
    this.isAI = isAI;
    if (isDiff && (this.gameInProgress()))
        this.takeTurn(this.currentGame);
    
}