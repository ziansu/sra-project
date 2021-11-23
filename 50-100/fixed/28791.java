public void checkGameStatus() {
    if (this.isThereWinner()) {
        this.status = io.swagger.model.TicTacToeGame.GameStatusEnum.GameOverWinner.toString();
        return ;
    }
    if (this.isAllSpotsTaken()) {
        this.status = io.swagger.model.TicTacToeGame.GameStatusEnum.GameOverTie.toString();
    }else {
        this.status = io.swagger.model.TicTacToeGame.GameStatusEnum.InProgress.toString();
    }
}