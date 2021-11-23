public static void getRandomDeck(boolean key, com.blstream.studybox.api.RequestCallback<com.blstream.studybox.model.database.Decks> callback) {
    com.blstream.studybox.api.RestInterface restInterface = new com.blstream.studybox.api.RestClient().getService();
    restInterface.getRandomDeck(key, callback);
}