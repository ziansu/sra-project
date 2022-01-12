public void unDiscardFlashCard(int index) {
    int returnIndex = discardedCards.get(index).getCardIndex();
    flashCards.add(returnIndex, discardedCards.remove(index));
}