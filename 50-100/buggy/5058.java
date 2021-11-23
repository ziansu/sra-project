@java.lang.Override
public void fetchRandomDeck(final com.blstream.studybox.database.DataProvider.OnDecksReceivedListener<java.util.List<com.blstream.studybox.model.database.Decks>> listener) {
    com.blstream.studybox.api.RestClientManager.getRandomDeck(true, true, new com.blstream.studybox.api.RequestCallback(new com.blstream.studybox.api.RequestListener<java.util.List<com.blstream.studybox.model.database.Decks>>() {
        @java.lang.Override
        public void onSuccess(java.util.List<com.blstream.studybox.model.database.Decks> response) {
            listener.OnDecksReceived(response);
        }

        @java.lang.Override
        public void onFailure(retrofit.RetrofitError error) {
        }
    }));
}