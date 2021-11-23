public boolean isSfidaRound() {
    int currentWord = ((currentPosition) % 5) + 1;
    return (currentWord == 1) || ((java.util.Arrays.binarySearch(currentCard.getSpeciali(), currentWord)) >= 0);
}