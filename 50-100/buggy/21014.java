@java.lang.Override
public void fetchPrivateDecks(final com.blstream.studybox.database.DataProvider.OnDecksReceivedListener listener) {
    com.blstream.studybox.api.RestClientManager.getDecks(com.blstream.studybox.database.DataHelper.DECKS_KEY, new com.blstream.studybox.api.AuthRequestInterceptor(new com.blstream.studybox.auth.login.LoginManager(context).getCredentials()), new com.blstream.studybox.api.RequestCallback(new com.blstream.studybox.api.RequestListener<java.util.List<com.blstream.studybox.model.database.Decks>>() {
        @java.lang.Override
        public void onSuccess(java.util.List<com.blstream.studybox.model.database.Decks> response) {
            privateDecks = response;
            saveDecksToDataBase(response);
            listener.OnDecksReceived(response);
        }

        @java.lang.Override
        public void onFailure(retrofit.RetrofitError error) {
        }
    }));
}