private logic.Piece turnCPU() {
    depth = DEPTH;
    logic.Heur bestMove = miniMax();
    bestMoveMessages.addFirst((((((((("Melhor jogada para o jogador " + (util.Utility.itop(activeplayer))) + " no turno ") + (turnId)) + ": (") + ((bestMove.row) + 1)) + ",") + (util.Utility.itoc(bestMove.col))) + "). "));
    return new logic.Piece(bestMove, activeplayer);
}