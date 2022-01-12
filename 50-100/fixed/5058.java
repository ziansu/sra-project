@java.lang.Override
public void fetchRandomDeck(final com.blstream.studybox.database.DataProvider.OnDecksReceivedListener<com.blstream.studybox.model.database.Decks> listener) {
    com.blstream.studybox.api.RestClientManager.getRandomDeck(true, new com.blstream.studybox.api.RequestCallback(new com.blstream.studybox.api.RequestListener<com.blstream.studybox.model.database.Decks>() {
        @java.lang.Override
        public void onSuccess(com.blstream.studybox.model.database.Decks response) {
            listener.OnDecksReceived(response);
        }

        @java.lang.Override
        public void onFailure(retrofit.RetrofitError error) {
        }
    }));
}