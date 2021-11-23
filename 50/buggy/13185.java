@java.lang.Override
public void run() {
    java.util.List<com.tlongdev.spicio.domain.model.Series> searchResult = mRepository.searchSeries(mSearchQuery);
    if (searchResult == null) {
        postError();
    }
    postResult(searchResult);
}