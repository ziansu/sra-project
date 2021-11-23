@java.lang.Override
protected void process(org.softwareFm.card.configuration.CardConfig cardConfig, final org.softwarefm.collections.explorer.Explorer explorer, org.softwareFm.jdtBinding.api.BindingRipperResult ripperResult, java.util.Map<java.lang.String, java.lang.Object> result) {
    java.lang.String artifactUrl = makeUrl(ripperResult, cardConfig, result);
    explorer.displayCard(artifactUrl, new org.softwareFm.card.dataStore.CardAndCollectionDataStoreAdapter() {
        @java.lang.Override
        public void finished(org.softwareFm.card.card.ICardHolder cardHolder, java.lang.String url, org.softwareFm.card.card.ICard card) {
            explorer.showRandomContent(card);
        }
    });
}