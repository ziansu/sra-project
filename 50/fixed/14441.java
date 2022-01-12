@java.lang.Override
protected void onPause() {
    super.onPause();
    com.hermes.comics.services.ComicsPageFetcherService.unregister(this, receiver);
}