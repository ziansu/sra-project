public boolean isClueUnanswered(final com.jam.jampardy.model.Clue clue) {
    return (answeredClueMap.get(clue)) == (com.jam.jampardy.model.GameBoard.Contestant.BLANK);
}