private void incorrectlyAnswerClue(final com.jam.jampardy.model.GameBoard.Contestant contestant, final com.jam.jampardy.model.Clue clue) {
    if ((incorrectlyAnsweredClueMap.get(clue)) == null) {
        final java.util.Set<com.jam.jampardy.model.GameBoard.Contestant> contestantSet = new java.util.HashSet<>();
        incorrectlyAnsweredClueMap.put(clue, contestantSet);
    }
    incorrectlyAnsweredClueMap.get(clue).add(contestant);
}