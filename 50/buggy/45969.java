private void notifyRound() {
    for (com.fibelatti.accedomemory.helpers.IGameHelperListener listener : listeners) {
        listener.onRound(currentGame);
    }
    cardsClicked = 0;
}