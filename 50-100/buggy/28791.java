public boolean checkGameStatus() {
    boolean gameStatusCheck = true;
    if (this.isAllSpotsTaken()) {
        if (this.isThereWinner()) {
            this.status = io.swagger.model.TicTacToeGame.GameStatusEnum.GameOverWinner.toString();
        }else {
            this.status = io.swagger.model.TicTacToeGame.GameStatusEnum.GameOverTie.toString();
        }
    }else {
        this.status = io.swagger.model.TicTacToeGame.GameStatusEnum.InProgress.toString();
    }
    return gameStatusCheck;
}