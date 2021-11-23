@java.lang.Override
public void onClick(android.view.View view) {
    deckEmptyDialog.cancel();
    resetGame();
    deck = new com.micste.busdriver.Deck();
}