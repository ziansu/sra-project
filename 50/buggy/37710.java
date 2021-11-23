public void unDiscardFlashCard(int index) {
    int returnIndex = discardedCards.get(0).getCardIndex();
    flashCards.add(returnIndex, discardedCards.remove(0));
}