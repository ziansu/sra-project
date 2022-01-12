private void executeMovesFromBeginning() {
    for (com.tdt4240.RawHeroes.event.move.Move move : moves) {
        move.execute(initialBoard);
    }
}