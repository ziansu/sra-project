public int getNbrRoundsPlayed() {
    int nbrRoundsPlayed = nbrRoundsFinished;
    for (int i = 0; i < (results.length); i++) {
        if (((results[i]) > (ResultList.MAX_SCORE)) || ((results[i]) < (ResultList.MIN_SCORE))) {
            nbrRoundsPlayed--;
        }
    }
    return nbrRoundsPlayed;
}