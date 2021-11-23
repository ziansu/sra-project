public boolean isClueAnsweredBy(final com.jam.jampardy.model.GameBoard.Contestant contestant, final com.jam.jampardy.model.Clue clue) {
    return ((contestant != null) && (clue != null)) && ((answeredClueMap.get(clue)) == contestant);
}