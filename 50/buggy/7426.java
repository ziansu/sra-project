public void add(com.eleybourn.bookcatalogue.searchorder.SearchProvider provider) {
    provider.setState((((provider.getFlag()) & (mProvidersEnabled)) != 0));
    mList.add(provider);
}