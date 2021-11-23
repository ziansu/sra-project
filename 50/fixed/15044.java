public int GetAIMove(connectfour.AI ai) {
    return ai.GetAIMove(this.board, player2.GetMarker(), player1.GetMarker(), this.turnCount);
}