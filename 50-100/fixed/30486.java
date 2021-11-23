public boolean guessChampion(java.lang.String guess) {
    boolean correct = champions.get(index).guessName(guess);
    if (correct) {
        (index)++;
        if ((index) == ((champions.size()) - 1)) {
            endTime = java.lang.System.currentTimeMillis();
        }
    }
    return correct;
}