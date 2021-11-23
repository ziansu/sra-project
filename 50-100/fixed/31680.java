private void nextMove() {
    int whosTurn = this.thisGame.whosTurn();
    if (whosTurn == 0) {
        this.playerInfoLabel.setText(this.thisGame.getCpuTurnMsg());
        java.util.Random r = new java.util.Random();
        drawSequinInBoard(r.nextInt(6), r.nextInt(7), this.thisGame.getCpuPlayer(), null);
    }else {
        this.playerInfoLabel.setText(this.thisGame.getPlayerTurnMsg());
    }
}