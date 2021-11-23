public com.softserve.academy.spaced.repetition.domain.Deck addDeck(java.lang.Long deckId) {
    com.softserve.academy.spaced.repetition.domain.Deck deck = deckRepository.getDeckById(deckId);
    com.softserve.academy.spaced.repetition.domain.User user = userService.getAuthorizedUser();
    com.softserve.academy.spaced.repetition.domain.Folder folder = user.getFolder();
    java.util.List<com.softserve.academy.spaced.repetition.domain.Deck> decks = folder.getDecks();
    decks.add(deck);
    folderRepository.save(folder);
    return deck;
}