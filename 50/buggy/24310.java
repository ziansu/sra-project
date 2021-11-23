public void randomMove() {
    tp.pr5.logic.Move move = random.getMove(this.game.getBoard(), this.game.getTurn());
    try {
        this.game.executeMove(move);
    } catch (tp.pr5.logic.InvalidMove e) {
    }
}