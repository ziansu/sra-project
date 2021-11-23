private void notifyRound() {
    cardsClicked = 0;
    for (com.fibelatti.accedomemory.helpers.IGameHelperListener listener : listeners) {
        listener.onRound(currentGame);
    }
}