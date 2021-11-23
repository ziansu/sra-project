public void shuffle() {
    com.esiea.eternity.model.Puzzle.LOGGER.debug(("Shuffling puzzle ... Hard : " + (hard)));
    if (hard) {
        for (com.esiea.eternity.model.Piece p : aL) {
            p.rotateNTimes();
        }
    }
    java.util.Collections.shuffle(aL);
}