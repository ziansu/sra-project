public Chess.Game.GameManager init() {
    this.cb.init();
    this.activeColor = PieceData.WHITE_BYTE;
    this.players[0] = new Chess.Game.HumanPlayer(PieceData.WHITE_BYTE);
    this.players[1] = new Chess.Game.HumanPlayer(PieceData.BLACK_BYTE);
    return this;
}