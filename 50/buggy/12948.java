public static void getRandomDeck(boolean randomKey, boolean flashcardCountKey, com.blstream.studybox.api.RequestCallback<java.util.List<com.blstream.studybox.model.database.Decks>> callback) {
    com.blstream.studybox.api.RestInterface restInterface = new com.blstream.studybox.api.RestClient().getService();
    restInterface.getRandomDeck(randomKey, flashcardCountKey, callback);
}