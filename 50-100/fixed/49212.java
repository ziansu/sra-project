@java.lang.Override
public void fetchPublicDecks(final com.blstream.studybox.database.DataProvider.OnDecksReceivedListener listener) {
    com.blstream.studybox.api.RestClientManager.getPublicDecks("true", new com.blstream.studybox.api.RequestCallback(new com.blstream.studybox.api.RequestListener<java.util.List<com.blstream.studybox.model.database.Decks>>() {
        @java.lang.Override
        public void onSuccess(java.util.List<com.blstream.studybox.model.database.Decks> response) {
            publicDecks = response;
            listener.OnDecksReceived(response);
        }

        @java.lang.Override
        public void onFailure(retrofit.RetrofitError error) {
        }
    }));
}