private boolean isPlayerTurn(com.fuentesj.tictactoe.data.Move move) {
    if (((this.getTurnCount()) % 2) == 0) {
        return move.getPlayer().getPlayerNumber().equals(PlayerNumber.ONE);
    }else {
        return move.getPlayer().getPlayerNumber().equals(PlayerNumber.TWO);
    }
}